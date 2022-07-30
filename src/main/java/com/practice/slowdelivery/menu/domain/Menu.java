package com.practice.slowdelivery.menu.domain;

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