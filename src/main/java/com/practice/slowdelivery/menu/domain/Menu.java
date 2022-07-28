package com.practice.slowdelivery.menu.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.practice.slowdelivery.common.entity.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@Table(name="Menu")
public class Menu extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "menu_id")
    private Long id;

    @Column(nullable = false, name="menu_name")
    private String menuName;

    @Column
    private String introduction;


//    @ManyToOne
//    @JoinColumn(name = "shop_id")
//    private Shop shop;


    public Menu(String menuName, String introduction){
        this.menuName=menuName;
        this.introduction=introduction;
    }

}
