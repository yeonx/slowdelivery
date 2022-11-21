package be.shop.slow_delivery.seller.presentation.dto;

import be.shop.slow_delivery.seller.application.dto.EmailValidateCommand;
import be.shop.slow_delivery.seller.application.dto.SellerSignUpCommand;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-13T13:53:47+0900",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class SellerDtoMapperImpl implements SellerDtoMapper {

    @Override
    public SellerSignUpCommand toCommand(SellerSignUpDto sellerSignUpDto) {
        if ( sellerSignUpDto == null ) {
            return null;
        }

        SellerSignUpCommand.SellerSignUpCommandBuilder sellerSignUpCommand = SellerSignUpCommand.builder();

        sellerSignUpCommand.username( sellerSignUpDto.getUsername() );
        sellerSignUpCommand.loginId( sellerSignUpDto.getLoginId() );
        sellerSignUpCommand.password( sellerSignUpDto.getPassword() );
        sellerSignUpCommand.email( sellerSignUpDto.getEmail() );
        sellerSignUpCommand.phoneNumber( sellerSignUpDto.getPhoneNumber() );

        return sellerSignUpCommand.build();
    }

    @Override
    public EmailValidateCommand toCommand(EmailValidateDto emailValidateDto) {
        if ( emailValidateDto == null ) {
            return null;
        }

        String emailAddress = null;

        emailAddress = emailValidateDto.getEmailAddress();

        EmailValidateCommand emailValidateCommand = new EmailValidateCommand( emailAddress );

        return emailValidateCommand;
    }
}
