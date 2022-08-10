package com.practice.slowdelivery.menu.domain;

import com.practice.slowdelivery.common.domain.DisplayInfo;
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
    private Long id;

    @Column(nullable = false, name="menu_name")
    private String menuName;

    @Column(nullable = true, name="introduction")
    private String introduction;

    @Embedded
    private DisplayInfo displayInfo;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    public Menu(Shop shop,String menuName, String introduction,DisplayInfo displayInfo){
        this.shop=shop;
        this.menuName=menuName;
        this.introduction=introduction;
        this.displayInfo = displayInfo;
    }

    public void updateMenu(String menuName,String introduction,DisplayInfo displayInfo){
        this.menuName=menuName;
        this.introduction=introduction;
        this.displayInfo = displayInfo;
    }

}