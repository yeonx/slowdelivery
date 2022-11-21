package be.shop.slow_delivery.shop.presentation.dto;

import be.shop.slow_delivery.shop.application.dto.ShopCreateCommand;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-13T13:53:47+0900",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class ShopDtoMapperImpl implements ShopDtoMapper {

    @Override
    public ShopCreateCommand toCreateCommand(ShopCreateDto shopCreateDto) {
        if ( shopCreateDto == null ) {
            return null;
        }

        ShopCreateCommand.ShopCreateCommandBuilder shopCreateCommand = ShopCreateCommand.builder();

        shopCreateCommand.shopName( shopCreateDto.getShopName() );
        shopCreateCommand.minOrderAmount( shopCreateDto.getMinOrderAmount() );
        shopCreateCommand.phoneNumber( shopCreateDto.getPhoneNumber() );
        shopCreateCommand.streetAddress( shopCreateDto.getStreetAddress() );
        shopCreateCommand.category( shopCreateDto.getCategory() );
        shopCreateCommand.introduction( shopCreateDto.getIntroduction() );
        shopCreateCommand.openingHours( shopCreateDto.getOpeningHours() );
        shopCreateCommand.dayOff( shopCreateDto.getDayOff() );

        return shopCreateCommand.build();
    }
}
