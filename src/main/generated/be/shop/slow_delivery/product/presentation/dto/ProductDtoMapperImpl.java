package be.shop.slow_delivery.product.presentation.dto;

import be.shop.slow_delivery.product.application.command.ProductCreateCommand;
import be.shop.slow_delivery.product.application.criteria.IngredientGroupValidateCriteria;
import be.shop.slow_delivery.product.application.criteria.IngredientValidateCriteria;
import be.shop.slow_delivery.product.application.criteria.OptionGroupValidateCriteria;
import be.shop.slow_delivery.product.application.criteria.OptionValidateCriteria;
import be.shop.slow_delivery.product.application.criteria.ProductValidateCriteria;
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
public class ProductDtoMapperImpl implements ProductDtoMapper {

    @Override
    public ProductValidateCriteria toValidateCommand(ProductValidateDto productValidateDto) {
        if ( productValidateDto == null ) {
            return null;
        }

        ProductValidateCriteria.ProductValidateCriteriaBuilder productValidateCriteria = ProductValidateCriteria.builder();

        productValidateCriteria.id( productValidateDto.getId() );
        productValidateCriteria.name( productValidateDto.getName() );
        productValidateCriteria.price( toMoney( productValidateDto.getPrice() ) );
        productValidateCriteria.orderQuantity( toQuantity( productValidateDto.getOrderQuantity() ) );
        productValidateCriteria.ingredientGroups( ingredientGroupValidateDtoListToIngredientGroupValidateCriteriaList( productValidateDto.getIngredientGroups() ) );
        productValidateCriteria.optionGroups( optionGroupValidateDtoListToOptionGroupValidateCriteriaList( productValidateDto.getOptionGroups() ) );

        return productValidateCriteria.build();
    }

    @Override
    public ProductCreateCommand toCreateCommand(ProductCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        ProductCreateCommand.ProductCreateCommandBuilder productCreateCommand = ProductCreateCommand.builder();

        productCreateCommand.name( dto.getName() );
        productCreateCommand.description( dto.getDescription() );
        productCreateCommand.price( toMoney( dto.getPrice() ) );
        productCreateCommand.maxOrderQuantity( toQuantity( dto.getMaxOrderQuantity() ) );
        productCreateCommand.stock( toQuantity( dto.getStock() ) );

        return productCreateCommand.build();
    }

    protected List<IngredientValidateCriteria> ingredientValidateDtoListToIngredientValidateCriteriaList(List<IngredientValidateDto> list) {
        if ( list == null ) {
            return null;
        }

        List<IngredientValidateCriteria> list1 = new ArrayList<IngredientValidateCriteria>( list.size() );
        for ( IngredientValidateDto ingredientValidateDto : list ) {
            list1.add( toValidateCommand( ingredientValidateDto ) );
        }

        return list1;
    }

    protected IngredientGroupValidateCriteria ingredientGroupValidateDtoToIngredientGroupValidateCriteria(IngredientGroupValidateDto ingredientGroupValidateDto) {
        if ( ingredientGroupValidateDto == null ) {
            return null;
        }

        IngredientGroupValidateCriteria.IngredientGroupValidateCriteriaBuilder ingredientGroupValidateCriteria = IngredientGroupValidateCriteria.builder();

        ingredientGroupValidateCriteria.id( ingredientGroupValidateDto.getId() );
        ingredientGroupValidateCriteria.name( ingredientGroupValidateDto.getName() );
        ingredientGroupValidateCriteria.ingredients( ingredientValidateDtoListToIngredientValidateCriteriaList( ingredientGroupValidateDto.getIngredients() ) );

        return ingredientGroupValidateCriteria.build();
    }

    protected List<IngredientGroupValidateCriteria> ingredientGroupValidateDtoListToIngredientGroupValidateCriteriaList(List<IngredientGroupValidateDto> list) {
        if ( list == null ) {
            return null;
        }

        List<IngredientGroupValidateCriteria> list1 = new ArrayList<IngredientGroupValidateCriteria>( list.size() );
        for ( IngredientGroupValidateDto ingredientGroupValidateDto : list ) {
            list1.add( ingredientGroupValidateDtoToIngredientGroupValidateCriteria( ingredientGroupValidateDto ) );
        }

        return list1;
    }

    protected List<OptionValidateCriteria> optionValidateDtoListToOptionValidateCriteriaList(List<OptionValidateDto> list) {
        if ( list == null ) {
            return null;
        }

        List<OptionValidateCriteria> list1 = new ArrayList<OptionValidateCriteria>( list.size() );
        for ( OptionValidateDto optionValidateDto : list ) {
            list1.add( toValidateCommand( optionValidateDto ) );
        }

        return list1;
    }

    protected OptionGroupValidateCriteria optionGroupValidateDtoToOptionGroupValidateCriteria(OptionGroupValidateDto optionGroupValidateDto) {
        if ( optionGroupValidateDto == null ) {
            return null;
        }

        OptionGroupValidateCriteria.OptionGroupValidateCriteriaBuilder optionGroupValidateCriteria = OptionGroupValidateCriteria.builder();

        optionGroupValidateCriteria.id( optionGroupValidateDto.getId() );
        optionGroupValidateCriteria.name( optionGroupValidateDto.getName() );
        optionGroupValidateCriteria.options( optionValidateDtoListToOptionValidateCriteriaList( optionGroupValidateDto.getOptions() ) );

        return optionGroupValidateCriteria.build();
    }

    protected List<OptionGroupValidateCriteria> optionGroupValidateDtoListToOptionGroupValidateCriteriaList(List<OptionGroupValidateDto> list) {
        if ( list == null ) {
            return null;
        }

        List<OptionGroupValidateCriteria> list1 = new ArrayList<OptionGroupValidateCriteria>( list.size() );
        for ( OptionGroupValidateDto optionGroupValidateDto : list ) {
            list1.add( optionGroupValidateDtoToOptionGroupValidateCriteria( optionGroupValidateDto ) );
        }

        return list1;
    }
}
