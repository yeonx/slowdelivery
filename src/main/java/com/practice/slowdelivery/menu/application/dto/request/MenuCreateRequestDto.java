package com.practice.slowdelivery.menu.application.dto.request;

import com.practice.slowdelivery.menu.domain.Menu;
import com.practice.slowdelivery.shop.domain.Shop;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class MenuCreateRequestDto {

    @NotBlank
    private String menuName;

    private String introduction;

    @NotBlank
    private Boolean isDisplay;

    @NotBlank
    private Integer displayOrder;


    public Menu toEntity(Shop shop){
        return new Menu(shop,menuName,introduction,isDisplay,displayOrder);
    }
}
