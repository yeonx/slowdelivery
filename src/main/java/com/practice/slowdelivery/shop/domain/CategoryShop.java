package be.shop.slow_delivery.shop.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
        name = "category_shop",
        uniqueConstraints = @UniqueConstraint(columnNames = {"category_id", "shop_id"}))
@Entity
public class CategoryShop {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_id", nullable = false)
    private Long categoryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id", nullable = false)
    private Shop shop;

    CategoryShop(Shop shop, Long categoryId) {
        this.shop = shop;
        this.categoryId = categoryId;
    }
}