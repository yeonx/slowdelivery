package be.shop.slow_delivery.product.application.query;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * be.shop.slow_delivery.product.application.query.QProductDetailInfo is a Querydsl Projection type for ProductDetailInfo
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QProductDetailInfo extends ConstructorExpression<ProductDetailInfo> {

    private static final long serialVersionUID = 1521780130L;

    public QProductDetailInfo(com.querydsl.core.types.Expression<Long> productId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<String> description, com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.common.domain.Money> price, com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.common.domain.Quantity> maxOrderQuantity, com.querydsl.core.types.Expression<Long> thumbnailFileId, com.querydsl.core.types.Expression<Boolean> isSale) {
        super(ProductDetailInfo.class, new Class<?>[]{long.class, String.class, String.class, be.shop.slow_delivery.common.domain.Money.class, be.shop.slow_delivery.common.domain.Quantity.class, long.class, boolean.class}, productId, name, description, price, maxOrderQuantity, thumbnailFileId, isSale);
    }

}

