package com.practice.slowdelivery.shop.infrastructure.persistence;

import com.practice.slowdelivery.shop.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop,Long> {
    Shop findByShopId(Long shopId);
}