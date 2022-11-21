package be.shop.slow_delivery.shop.application.dto;

import be.shop.slow_delivery.category.domain.Category;
import be.shop.slow_delivery.shop.domain.Shop;
import be.shop.slow_delivery.shop.domain.ShopLocation;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-13T13:53:47+0900",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class ShopCommandMapperImpl implements ShopCommandMapper {

    @Override
    public Shop toShop(ShopCreateCommand command, Category category) {
        if ( command == null && category == null ) {
            return null;
        }

        Shop.ShopBuilder shop = Shop.builder();

        if ( command != null ) {
            shop.location( shopCreateCommandToShopLocation( command ) );
            shop.name( command.getShopName() );
            shop.minOrderAmount( toMoney( command.getMinOrderAmount() ) );
            shop.phoneNumber( command.getPhoneNumber() );
            shop.openingHours( command.getOpeningHours() );
            shop.dayOff( command.getDayOff() );
        }
        shop.category( category );

        return shop.build();
    }

    protected ShopLocation shopCreateCommandToShopLocation(ShopCreateCommand shopCreateCommand) {
        if ( shopCreateCommand == null ) {
            return null;
        }

        ShopLocation.ShopLocationBuilder shopLocation = ShopLocation.builder();

        shopLocation.streetAddress( shopCreateCommand.getStreetAddress() );

        return shopLocation.build();
    }
}
