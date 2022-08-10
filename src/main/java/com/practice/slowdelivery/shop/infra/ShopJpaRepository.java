package com.practice.slowdelivery.shop.infra;

import com.practice.slowdelivery.shop.domain.Shop;
import com.practice.slowdelivery.shop.domain.ShopRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopJpaRepository extends JpaRepository<Shop, Long>, ShopRepository {
}
