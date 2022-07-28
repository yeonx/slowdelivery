package com.practice.slowdelivery.menu_product.infrastruture;

import com.practice.slowdelivery.menu_product.domain.MenuToProduct;
import com.practice.slowdelivery.menu_product.domain.MenuToProductId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuToProductDao extends JpaRepository<MenuToProduct, MenuToProductId> {

    List<MenuToProduct> findAllByMenuId(Long menuId);
}
