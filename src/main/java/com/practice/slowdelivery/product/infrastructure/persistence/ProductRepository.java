package com.practice.slowdelivery.product.infrastructure.persistence;

import com.practice.slowdelivery.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
