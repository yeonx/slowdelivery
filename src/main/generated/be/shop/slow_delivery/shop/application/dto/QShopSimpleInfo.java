package be.shop.slow_delivery.shop.application.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * be.shop.slow_delivery.shop.application.dto.QShopSimpleInfo is a Querydsl Projection type for ShopSimpleInfo
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QShopSimpleInfo extends ConstructorExpression<ShopSimpleInfo> {

    private static final long serialVersionUID = 1052324370L;

    public QShopSimpleInfo(com.querydsl.core.types.Expression<Long> shopId, com.querydsl.core.types.Expression<String> shopName, com.querydsl.core.types.Expression<Integer> minOrderAmount, com.querydsl.core.types.Expression<String> thumbnailPath, com.querydsl.core.types.Expression<? extends java.util.List<Integer>> defaultDeliveryFees) {
        super(ShopSimpleInfo.class, new Class<?>[]{long.class, String.class, int.class, String.class, java.util.List.class}, shopId, shopName, minOrderAmount, thumbnailPath, defaultDeliveryFees);
    }

    public QShopSimpleInfo(com.querydsl.core.types.Expression<Long> shopId, com.querydsl.core.types.Expression<String> shopName, com.querydsl.core.types.Expression<Integer> minOrderAmount, com.querydsl.core.types.Expression<String> thumbnailPath) {
        super(ShopSimpleInfo.class, new Class<?>[]{long.class, String.class, int.class, String.class}, shopId, shopName, minOrderAmount, thumbnailPath);
    }

}

