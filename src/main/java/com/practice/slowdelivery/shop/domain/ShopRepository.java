package com.practice.slowdelivery.shop.domain;

import java.util.Optional;

public interface ShopRepository {
    Shop save(Shop shop);
    Optional<Shop> findById(Long shopId);
}
