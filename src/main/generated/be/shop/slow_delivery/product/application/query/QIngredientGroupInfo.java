package be.shop.slow_delivery.product.application.query;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * be.shop.slow_delivery.product.application.query.QIngredientGroupInfo is a Querydsl Projection type for IngredientGroupInfo
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QIngredientGroupInfo extends ConstructorExpression<IngredientGroupInfo> {

    private static final long serialVersionUID = 1588158128L;

    public QIngredientGroupInfo(com.querydsl.core.types.Expression<Long> ingredientGroupId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.common.domain.Quantity> minSelectCount, com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.common.domain.Quantity> maxSelectCount, com.querydsl.core.types.Expression<? extends java.util.List<IngredientInfo>> ingredients) {
        super(IngredientGroupInfo.class, new Class<?>[]{long.class, String.class, be.shop.slow_delivery.common.domain.Quantity.class, be.shop.slow_delivery.common.domain.Quantity.class, java.util.List.class}, ingredientGroupId, name, minSelectCount, maxSelectCount, ingredients);
    }

}

