package com.practice.slowdelivery.shop.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.practice.slowdelivery.menu.domain.Menu;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="shop")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Shop {

    @Id
    @GeneratedValue
    @Column(name = "shop_id")
    private Long shopPK;

    @JsonManagedReference
    @JsonBackReference
    @OneToMany(mappedBy = "shop")
    private List<Menu> menuList;

}