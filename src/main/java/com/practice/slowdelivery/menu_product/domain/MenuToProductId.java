package com.practice.slowdelivery.menu_product.domain;

import java.io.Serializable;

public class MenuToProductId implements Serializable {
    private Long menu;
    private Long product;

    public MenuToProductId(){}
    public MenuToProductId(Long menuId,Long productId){
        super();
        this.menu=menuId;
        this.product=productId;
    }
}
