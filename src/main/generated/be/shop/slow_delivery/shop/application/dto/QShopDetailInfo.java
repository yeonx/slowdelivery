package be.shop.slow_delivery.shop.application.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * be.shop.slow_delivery.shop.application.dto.QShopDetailInfo is a Querydsl Projection type for ShopDetailInfo
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QShopDetailInfo extends ConstructorExpression<ShopDetailInfo> {

    private static final long serialVersionUID = 1447604529L;

    public QShopDetailInfo(com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.shop.domain.Shop> shop, com.querydsl.core.types.Expression<String> thumbnailPath, com.querydsl.core.types.Expression<? extends java.util.List<Integer>> defaultDeliveryFees) {
        super(ShopDetailInfo.class, new Class<?>[]{be.shop.slow_delivery.shop.domain.Shop.class, String.class, java.util.List.class}, shop, thumbnailPath, defaultDeliveryFees);
    }

}

