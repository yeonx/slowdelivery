package be.shop.slow_delivery.config.auth;

import be.shop.slow_delivery.jwt.TokenProvider;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Profile("!test")
@Slf4j
@RequiredArgsConstructor
@Component
public class JwtAuthorizationFilter extends OncePerRequestFilter {
    private final TokenProvider tokenProvider;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String authorizationHeader = request.getHeader(AuthConstraints.HEADER_STRING.getValue());
        if(authorizationHeader == null || !authorizationHeader.startsWith(AuthConstraints.TOKEN_PREFIX.getValue())){
            filterChain.doFilter(request, response);
            return;
        }

        String accessToken = authorizationHeader.replace(AuthConstraints.TOKEN_PREFIX.getValue(), "");
        if (accessToken.isBlank()){
            filterChain.doFilter(request, response);
            return;
        }

        try {
            SecurityContext context = SecurityContextHolder.createEmptyContext();
            Claims claims = tokenProvider.verify(accessToken);
            JwtUserDetails jwtUserDetails = new JwtUserDetails(claims);
            Authentication authentication
                    = new UsernamePasswordAuthenticationToken(jwtUserDetails, null, jwtUserDetails.getAuthorities());
            context.setAuthentication(authentication);
            SecurityContextHolder.setContext(context);
        } catch (SecurityException | MalformedJwtException e){
        log.info("????????? JWT ???????????????.");
        } catch (ExpiredJwtException e){
            log.info("????????? JWT ???????????????.");
        } catch (UnsupportedJwtException e){
            log.info("???????????? ?????? JWT ???????????????.");
        } catch (IllegalArgumentException e){
            log.info("JWT ????????? ?????????????????????.");
        }
        filterChain.doFilter(request, response);
    }
}
