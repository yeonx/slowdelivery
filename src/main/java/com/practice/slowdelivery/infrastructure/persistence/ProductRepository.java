package com.practice.slowdelivery.infrastructure.persistence;

import com.practice.slowdelivery.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
