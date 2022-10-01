package be.shop.slow_delivery.shop.presentation.dto;

import be.shop.slow_delivery.shop.application.dto.ShopCreateCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ShopDtoMapper {
    ShopDtoMapper INSTANCE = Mappers.getMapper(ShopDtoMapper.class);

    ShopCreateCommand toCreateCommand(ShopCreateDto shopCreateDto);
}
