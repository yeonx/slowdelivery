package com.practice.slowdelivery.product.domain.mapping;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.practice.slowdelivery.menu.domain.Menu;
import com.practice.slowdelivery.product.domain.Product;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@IdClass(MenuToProductId.class)
public class MenuToProduct implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name="menu_id")
    private Menu menu;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name="product_id")
    private Product product;

    @Column(name="is_display")
    private Boolean isDisplay;

    @Column(name="display_order")
    private Integer displayOrder;

}