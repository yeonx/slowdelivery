package com.practice.slowdelivery.product.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="product")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name="product_name")
    private String productName;

    @Column(name="price")
    private Integer price;

    @Column(name="introduction")
    private String introduction;

    @Column(name="is_sale")
    private Boolean isSale;

    @Column(name="max_order_quantity")
    private Integer maxOrderQuantity;

    @Builder
    public Product(String productName,Integer price, String introduction,Boolean isSale,Integer maxOrderQuantity){
        this.productName= productName;
        this.price=price;
        this.introduction=introduction;
        this.isSale=isSale;
        this.maxOrderQuantity=maxOrderQuantity;
    }
}