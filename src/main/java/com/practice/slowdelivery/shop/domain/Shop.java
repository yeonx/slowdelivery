package com.practice.slowdelivery.shop.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.practice.slowdelivery.common.domain.Money;
import com.practice.slowdelivery.common.domain.PhoneNumber;
import com.practice.slowdelivery.menu.domain.Menu;
import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="shop")
public class Shop {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="shop_id")
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name = "thumbnail_file_id",nullable = true)
    private Long shopThumbnailFiledId;

    @Embedded @Column(name="min_order_price",nullable = false)
    private Money minOrderAmount;

    @Column(name="introduction",nullable = true)
    private String introduction;

    @Embedded
    private PhoneNumber phoneNumber;

    @Embedded
    private BusinessTimeInfo businessTimeInfo;



}