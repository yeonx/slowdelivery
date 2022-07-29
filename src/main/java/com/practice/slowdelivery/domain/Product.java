package com.practice.slowdelivery.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="product")
@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue
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

    public Product(String productName,Integer price, String introduction,Boolean isSale,Integer maxOrderQuantity){
        this.productName= productName;
        this.price=price;
        this.introduction=introduction;
        this.isSale=isSale;
        this.maxOrderQuantity=maxOrderQuantity;
    }
}
