package com.practice.slowdelivery.menu.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MenuDto {

    private Long menuPK;

    private String menuName;

    private String introduction;
}
