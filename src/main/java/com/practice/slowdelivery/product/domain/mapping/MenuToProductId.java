package com.practice.slowdelivery.product.domain.mapping;

import java.io.Serializable;

//id가 2개인 경우이기 때문에 id class를 만들어줘야 함.
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