package com.practice.slowdelivery.product.domain.mapping;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.practice.slowdelivery.menu.domain.Menu;
import com.practice.slowdelivery.product.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(MenuToProductId.class)
public class MenuToProduct implements Serializable {

    @Id
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="menu_id")
    private Menu menu;

    @Id
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="product_id")
    private Product product;

    @Column(name="is_display")
    private Boolean isDisplay;

    @Column(name="display_order")
    private Integer displayOrder;

}