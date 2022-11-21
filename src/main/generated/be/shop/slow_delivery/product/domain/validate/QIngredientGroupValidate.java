package be.shop.slow_delivery.product.domain.validate;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * be.shop.slow_delivery.product.domain.validate.QIngredientGroupValidate is a Querydsl Projection type for IngredientGroupValidate
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QIngredientGroupValidate extends ConstructorExpression<IngredientGroupValidate> {

    private static final long serialVersionUID = -109802898L;

    public QIngredientGroupValidate(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<? extends be.shop.slow_delivery.product.domain.SelectCount> selectCount, com.querydsl.core.types.Expression<? extends java.util.List<IngredientGroupValidate.IngredientValidate>> ingredients) {
        super(IngredientGroupValidate.class, new Class<?>[]{long.class, String.class, be.shop.slow_delivery.product.domain.SelectCount.class, java.util.List.class}, id, name, selectCount, ingredients);
    }

}

