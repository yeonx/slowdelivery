package com.practice.slowdelivery.infrastructure.persistence.mapping;

import com.practice.slowdelivery.domain.mapping.MenuToProduct;
import com.practice.slowdelivery.domain.mapping.MenuToProductId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuToProductRepository extends JpaRepository<MenuToProduct, MenuToProductId> {
    List<MenuToProduct> findAllByMenuId(Long menuId);
}
