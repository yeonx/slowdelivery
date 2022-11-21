package be.shop.slow_delivery.menu.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMenuProduct is a Querydsl query type for MenuProduct
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMenuProduct extends EntityPathBase<MenuProduct> {

    private static final long serialVersionUID = 1356430668L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMenuProduct menuProduct = new QMenuProduct("menuProduct");

    public final be.shop.slow_delivery.common.domain.QBaseTimeEntity _super = new be.shop.slow_delivery.common.domain.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final be.shop.slow_delivery.common.domain.QDisplayInfo displayInfo;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMenu menu;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final be.shop.slow_delivery.product.domain.QProduct product;

    public QMenuProduct(String variable) {
        this(MenuProduct.class, forVariable(variable), INITS);
    }

    public QMenuProduct(Path<? extends MenuProduct> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMenuProduct(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMenuProduct(PathMetadata metadata, PathInits inits) {
        this(MenuProduct.class, metadata, inits);
    }

    public QMenuProduct(Class<? extends MenuProduct> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.displayInfo = inits.isInitialized("displayInfo") ? new be.shop.slow_delivery.common.domain.QDisplayInfo(forProperty("displayInfo"), inits.get("displayInfo")) : null;
        this.menu = inits.isInitialized("menu") ? new QMenu(forProperty("menu"), inits.get("menu")) : null;
        this.product = inits.isInitialized("product") ? new be.shop.slow_delivery.product.domain.QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

