package be.shop.slow_delivery.menu.presentation.dto;

import be.shop.slow_delivery.menu.application.dto.request.MenuCreateCommand;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-13T13:53:47+0900",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class MenuDtoMapperImpl implements MenuDtoMapper {

    @Override
    public MenuCreateCommand toCreateCommand(MenuFormDto menuForm) {
        if ( menuForm == null ) {
            return null;
        }

        MenuCreateCommand menuCreateCommand = new MenuCreateCommand();

        menuCreateCommand.setMenuName( menuForm.getMenuName() );
        menuCreateCommand.setIntroduction( menuForm.getIntroduction() );

        return menuCreateCommand;
    }
}
