package com.practice.slowdelivery.infrastructure.persistence;

import com.practice.slowdelivery.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
