package be.shop.slow_delivery.product.domain.validate;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * be.shop.slow_delivery.product.domain.validate.QOptionGroupValidate_OptionValidate is a Querydsl Projection type for OptionValidate
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QOptionGroupValidate_OptionValidate extends ConstructorExpression<OptionGroupValidate.OptionValidate> {

    private static final long serialVersionUID = -1204456465L;

    public QOptionGroupValidate_OptionValidate(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.common.domain.Money> price) {
        super(OptionGroupValidate.OptionValidate.class, new Class<?>[]{long.class, String.class, be.shop.slow_delivery.common.domain.Money.class}, id, name, price);
    }

}

