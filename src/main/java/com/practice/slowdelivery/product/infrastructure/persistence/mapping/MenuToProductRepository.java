package com.practice.slowdelivery.product.infrastructure.persistence.mapping;


import com.practice.slowdelivery.product.domain.mapping.MenuToProduct;
import com.practice.slowdelivery.product.domain.mapping.MenuToProductId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuToProductRepository extends JpaRepository<MenuToProduct, MenuToProductId> {
    List<MenuToProduct> findAllByMenuId(Long menuId); //menu id에 저장된 product 모두 가져오기
}
