package com.practice.slowdelivery.shop.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.practice.slowdelivery.category.domain.Category;
import com.practice.slowdelivery.common.domain.Money;
import com.practice.slowdelivery.common.domain.PhoneNumber;
import com.practice.slowdelivery.exception.ErrorCode;
import com.practice.slowdelivery.exception.InvalidValueException;
import com.practice.slowdelivery.menu.domain.Menu;
import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.practice.slowdelivery.exception.ErrorCode.CATEGORY_COUNT;

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

    @Embedded
    private ShopLocation location;

    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CategoryShop> categories = new ArrayList<>();

    @Builder
    public Shop(Long id,String name, Money minOrderAmount, PhoneNumber phoneNumber,String introduction, BusinessTimeInfo businessTimeInfo,ShopLocation location,Long shopThumbnailFiledId, @Singular Set<Category> categories) {
        this.id = id;
        this.name = name;
        this.minOrderAmount = minOrderAmount;
        this.phoneNumber = phoneNumber;
        this.introduction=introduction;
        this.location=location;
        this.shopThumbnailFiledId = shopThumbnailFiledId;
        categories.forEach(category -> this.categories.add(new CategoryShop(this,category.getId())));
        if(this.categories.size()==0)
            throw new InvalidValueException(CATEGORY_COUNT);
    }
    public void updateShopThumbnail(Long fileId){
        this.shopThumbnailFiledId = fileId;
    }

    public void belongToCategory(Category category){
        categories.add(new CategoryShop(this,category.getId()));
    }

}