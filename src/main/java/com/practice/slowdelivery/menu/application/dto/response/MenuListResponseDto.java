package com.practice.slowdelivery.menu.application.dto.response;

import com.practice.slowdelivery.menu.application.dto.MenuListDto;
import com.practice.slowdelivery.shop.domain.Shop;
import lombok.Data;

@Data
public class MenuListResponseDto {

    private Long shopPK;

    private MenuListDto menuListDto;

    public MenuListResponseDto(Shop shop){
        menuListDto = new MenuListDto(shop.getMenuList());
    }
}
