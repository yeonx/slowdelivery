package com.practice.slowdelivery.shop.domain;

import com.practice.slowdelivery.common.domain.BaseTimeEntity;
import com.practice.slowdelivery.common.domain.Money;
import lombok.*;

import javax.persistence.*;

@Getter
@EqualsAndHashCode(exclude = "id", callSuper = false)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="order_amount_delivery_fee")
@Entity
public class OrderAmountDeliveryFee extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Getter(AccessLevel.PROTECTED)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id",nullable = false)
    private Shop shop;

    @Embedded
    @AttributeOverride(name="value",column = @Column(name="order_price",nullable = false))
    private Money orderAmount;

    @Embedded
    @AttributeOverride(name="value",column=@Column(name="fee",nullable = false))
    private Money fee;

    @Builder
    public OrderAmountDeliveryFee(Shop shop, Money orderAmount,Money fee){
        this.shop =shop;
        this.orderAmount=orderAmount;
        this.fee=fee;
    }
    public Long getShopId(){
        return shop.getId();
    }
}

