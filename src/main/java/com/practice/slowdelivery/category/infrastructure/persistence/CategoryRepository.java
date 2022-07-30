package com.practice.slowdelivery.category.infrastructure.persistence;

import com.practice.slowdelivery.category.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
