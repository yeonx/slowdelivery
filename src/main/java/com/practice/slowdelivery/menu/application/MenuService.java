package com.practice.slowdelivery.menu.application;

import com.practice.slowdelivery.exception.NotFoundException;
import com.practice.slowdelivery.menu.application.dto.request.MenuCreateRequestDto;
import com.practice.slowdelivery.menu.application.dto.request.MenuUpdateRequestDto;
import com.practice.slowdelivery.menu.application.dto.response.MenuListResponseDto;
import com.practice.slowdelivery.menu.domain.Menu;
import com.practice.slowdelivery.menu.domain.MenuRepository;
import com.practice.slowdelivery.shop.domain.Shop;
import com.practice.slowdelivery.shop.domain.ShopRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

import static com.practice.slowdelivery.exception.ErrorCode.MENU_NOT_FOUND;
import static com.practice.slowdelivery.exception.ErrorCode.SHOP_NOT_FOUND;

@Slf4j
@Service
@RequiredArgsConstructor
public class MenuService {

    private final ShopRepository shopRepository;
    private final MenuRepository menuRepository;

    @Transactional(readOnly = true)
    public MenuListResponseDto createMenuList(Long shopId){
        Shop shop = shopRepository.findById(shopId)
                .orElseThrow(() -> new NotFoundException(SHOP_NOT_FOUND));
        return new MenuListResponseDto(shop);
    }

    @Transactional
    public void createMenu(MenuCreateRequestDto menuCreateRequestDto, Shop shop){
        Menu menu;
        menu = makeMenuEntity(shop, menuCreateRequestDto);
        menuRepository.save(menu);
    }

    @Transactional
    public void updateMenu(Long menuId, MenuUpdateRequestDto menuUpdateRequestDto) throws IOException {
        Menu menu = menuRepository.findById(menuId)
                .orElseThrow(() -> new NotFoundException(MENU_NOT_FOUND));
        menu.updateMenu(menuUpdateRequestDto.getMenuName(),menuUpdateRequestDto.getIntroduction(),menuUpdateRequestDto.getDisplayInfo());
    }

    @Transactional
    public void deleteMenu(Long menuId){
        Menu menu = menuRepository.findById(menuId)
                .orElseThrow(() -> new NotFoundException(MENU_NOT_FOUND));
        menuRepository.deleteById(menuId);
    }

    private Menu makeMenuEntity(Shop shop, MenuCreateRequestDto menuCreateRequestDto){
        return menuCreateRequestDto.toEntity(shop);
    }

}
