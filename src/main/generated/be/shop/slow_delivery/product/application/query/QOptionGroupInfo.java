package be.shop.slow_delivery.product.application.query;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * be.shop.slow_delivery.product.application.query.QOptionGroupInfo is a Querydsl Projection type for OptionGroupInfo
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QOptionGroupInfo extends ConstructorExpression<OptionGroupInfo> {

    private static final long serialVersionUID = -2145289588L;

    public QOptionGroupInfo(com.querydsl.core.types.Expression<Long> optionGroupId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.common.domain.Quantity> maxSelectCount, com.querydsl.core.types.Expression<? extends java.util.List<OptionInfo>> options) {
        super(OptionGroupInfo.class, new Class<?>[]{long.class, String.class, be.shop.slow_delivery.common.domain.Quantity.class, java.util.List.class}, optionGroupId, name, maxSelectCount, options);
    }

}

