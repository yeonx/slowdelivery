package be.shop.slow_delivery.product.domain.validate;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * be.shop.slow_delivery.product.domain.validate.QProductValidate is a Querydsl Projection type for ProductValidate
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QProductValidate extends ConstructorExpression<ProductValidate> {

    private static final long serialVersionUID = 1527226671L;

    public QProductValidate(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.common.domain.Money> price, com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.common.domain.Quantity> orderQuantity) {
        super(ProductValidate.class, new Class<?>[]{long.class, String.class, be.shop.slow_delivery.common.domain.Money.class, be.shop.slow_delivery.common.domain.Quantity.class}, id, name, price, orderQuantity);
    }

}

