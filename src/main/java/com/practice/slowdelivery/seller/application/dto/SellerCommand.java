package be.shop.slow_delivery.seller.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
public class SellerCommand {

    @NotEmpty
    private String username;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String loginId;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotEmpty
    @Size(min = 3, max = 50)
    private String password;

    @NotEmpty
    @Size(min=3, max=50)
    private String email;

    @NotEmpty
    private String phoneNumber;


}
