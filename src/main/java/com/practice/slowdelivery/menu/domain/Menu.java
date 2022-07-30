package com.practice.slowdelivery.menu.domain;

import com.practice.slowdelivery.shop.domain.Shop;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="menu")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Menu{

    @Id
    @GeneratedValue
    @Column(name = "menu_id")
    private Long menuPK;

    @Column(nullable = false, name="menu_name")
    private String menuName;

    @Column(nullable = true, name="introduction")
    private String introduction;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    public Menu(Shop shop,String menuName, String introduction){
        this.shop=shop;
        this.menuName=menuName;
        this.introduction=introduction;
    }

    public void updateMenu(String menuName,String introduction){
        this.menuName=menuName;
        this.introduction=introduction;
    }

}