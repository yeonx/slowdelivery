package be.shop.slow_delivery.product.application.criteria;

import be.shop.slow_delivery.product.domain.validate.IngredientGroupValidate;
import be.shop.slow_delivery.product.domain.validate.OptionGroupValidate;
import be.shop.slow_delivery.product.domain.validate.ProductValidate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-13T13:53:47+0900",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class ProductCriteriaMapperImpl implements ProductCriteriaMapper {

    @Override
    public ProductValidate toProductValidate(ProductValidateCriteria criteria) {
        if ( criteria == null ) {
            return null;
        }

        ProductValidate.ProductValidateBuilder productValidate = ProductValidate.builder();

        productValidate.ingredientGroupValidates( toIngredientValidate( criteria.getIngredientGroups() ) );
        productValidate.optionGroupValidates( toOptionValidate( criteria.getOptionGroups() ) );
        productValidate.id( criteria.getId() );
        productValidate.name( criteria.getName() );
        productValidate.price( criteria.getPrice() );
        productValidate.orderQuantity( criteria.getOrderQuantity() );

        return productValidate.build();
    }

    @Override
    public List<IngredientGroupValidate> toIngredientValidate(List<IngredientGroupValidateCriteria> ingredientGroups) {
        if ( ingredientGroups == null ) {
            return null;
        }

        List<IngredientGroupValidate> list = new ArrayList<IngredientGroupValidate>( ingredientGroups.size() );
        for ( IngredientGroupValidateCriteria ingredientGroupValidateCriteria : ingredientGroups ) {
            list.add( toIngredientGroupValidate( ingredientGroupValidateCriteria ) );
        }

        return list;
    }

    @Override
    public List<OptionGroupValidate> toOptionValidate(List<OptionGroupValidateCriteria> optionGroups) {
        if ( optionGroups == null ) {
            return null;
        }

        List<OptionGroupValidate> list = new ArrayList<OptionGroupValidate>( optionGroups.size() );
        for ( OptionGroupValidateCriteria optionGroupValidateCriteria : optionGroups ) {
            list.add( toOptionGroupValidate( optionGroupValidateCriteria ) );
        }

        return list;
    }
}
