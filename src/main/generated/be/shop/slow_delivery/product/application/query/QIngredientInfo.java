package be.shop.slow_delivery.product.application.query;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * be.shop.slow_delivery.product.application.query.QIngredientInfo is a Querydsl Projection type for IngredientInfo
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QIngredientInfo extends ConstructorExpression<IngredientInfo> {

    private static final long serialVersionUID = -1853064213L;

    public QIngredientInfo(com.querydsl.core.types.Expression<Long> ingredientId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.common.domain.Money> price) {
        super(IngredientInfo.class, new Class<?>[]{long.class, String.class, be.shop.slow_delivery.common.domain.Money.class}, ingredientId, name, price);
    }

}

