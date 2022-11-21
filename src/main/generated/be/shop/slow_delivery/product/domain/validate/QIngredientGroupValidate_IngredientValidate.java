package be.shop.slow_delivery.product.domain.validate;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * be.shop.slow_delivery.product.domain.validate.QIngredientGroupValidate_IngredientValidate is a Querydsl Projection type for IngredientValidate
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QIngredientGroupValidate_IngredientValidate extends ConstructorExpression<IngredientGroupValidate.IngredientValidate> {

    private static final long serialVersionUID = -1019597401L;

    public QIngredientGroupValidate_IngredientValidate(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.common.domain.Money> price) {
        super(IngredientGroupValidate.IngredientValidate.class, new Class<?>[]{long.class, String.class, be.shop.slow_delivery.common.domain.Money.class}, id, name, price);
    }

}

