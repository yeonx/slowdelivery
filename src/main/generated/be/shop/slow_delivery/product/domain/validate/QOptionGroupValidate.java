package be.shop.slow_delivery.product.domain.validate;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * be.shop.slow_delivery.product.domain.validate.QOptionGroupValidate is a Querydsl Projection type for OptionGroupValidate
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QOptionGroupValidate extends ConstructorExpression<OptionGroupValidate> {

    private static final long serialVersionUID = -1804537014L;

    public QOptionGroupValidate(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.common.domain.Quantity> maxSelectCount, com.querydsl.core.types.Expression<? extends java.util.List<OptionGroupValidate.OptionValidate>> options) {
        super(OptionGroupValidate.class, new Class<?>[]{long.class, String.class, be.shop.slow_delivery.common.domain.Quantity.class, java.util.List.class}, id, name, maxSelectCount, options);
    }

}

