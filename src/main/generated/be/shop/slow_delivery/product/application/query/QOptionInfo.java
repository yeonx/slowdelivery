package be.shop.slow_delivery.product.application.query;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * be.shop.slow_delivery.product.application.query.QOptionInfo is a Querydsl Projection type for OptionInfo
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QOptionInfo extends ConstructorExpression<OptionInfo> {

    private static final long serialVersionUID = 74540687L;

    public QOptionInfo(com.querydsl.core.types.Expression<Long> optionId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.common.domain.Money> price) {
        super(OptionInfo.class, new Class<?>[]{long.class, String.class, be.shop.slow_delivery.common.domain.Money.class}, optionId, name, price);
    }

}

