package com.practice.slowdelivery.menu.infrastructure.persistence;

import com.practice.slowdelivery.menu.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
}