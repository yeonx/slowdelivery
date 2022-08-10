package com.practice.slowdelivery.menu.application.dto;

import com.practice.slowdelivery.common.domain.DisplayInfo;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class MenuDto {

    private Long menuId;

    private String menuName;

    private String introduction;

    private DisplayInfo displayInfo;
}
