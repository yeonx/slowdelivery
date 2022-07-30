package com.practice.slowdelivery.menu.application;

import com.practice.slowdelivery.menu.application.dto.request.MenuCreateRequestDto;
import com.practice.slowdelivery.menu.application.dto.request.MenuUpdateRequestDto;
import com.practice.slowdelivery.menu.application.dto.response.MenuListResponseDto;
import com.practice.slowdelivery.menu.domain.Menu;
import com.practice.slowdelivery.menu.infrastructure.persistence.MenuRepository;
import com.practice.slowdelivery.shop.domain.Shop;
import com.practice.slowdelivery.shop.infrastructure.persistence.ShopRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Slf4j
@Service
@RequiredArgsConstructor
public class MenuService {

    private final ShopRepository shopRepository;
    private final MenuRepository menuRepository;

    @Transactional(readOnly = true)
    public MenuListResponseDto createMenuList(Long shopPK){
        Shop shop = shopRepository.findByShopPK(shopPK);
        return new MenuListResponseDto(shop);
    }

    @Transactional
    public void createMenu(MenuCreateRequestDto menuCreateRequestDto, Shop shop){
        Menu menu;
        menu = makeMenuEntity(shop, menuCreateRequestDto);
        menuRepository.save(menu);
    }

    @Transactional
    public void updateMenu(Long menuPK, MenuUpdateRequestDto menuUpdateRequestDto) throws IOException {
        Menu menu = menuRepository.findByMenuPK(menuPK);
        menu.updateMenu(menuUpdateRequestDto.getMenuName(),menuUpdateRequestDto.getIntroduction(),menuUpdateRequestDto.getIsDisplay(),menuUpdateRequestDto.getDisplayOrder());
    }

    @Transactional
    public void deleteMenu(Long menuPK){
        Menu menu = menuRepository.findByMenuPK(menuPK);
        menuRepository.deleteById(menuPK);
    }

    private Menu makeMenuEntity(Shop shop, MenuCreateRequestDto menuCreateRequestDto){
        return menuCreateRequestDto.toEntity(shop);
    }

}
