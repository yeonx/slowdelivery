package com.practice.slowdelivery.infrastructure.persistence;

import com.practice.slowdelivery.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
}
