package be.shop.slow_delivery.menu.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMenu is a Querydsl query type for Menu
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMenu extends EntityPathBase<Menu> {

    private static final long serialVersionUID = -77673949L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMenu menu = new QMenu("menu");

    public final be.shop.slow_delivery.common.domain.QBaseTimeEntity _super = new be.shop.slow_delivery.common.domain.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    public final be.shop.slow_delivery.common.domain.QDisplayInfo displayInfo;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath menuName = createString("menuName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final be.shop.slow_delivery.shop.domain.QShop shop;

    public QMenu(String variable) {
        this(Menu.class, forVariable(variable), INITS);
    }

    public QMenu(Path<? extends Menu> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMenu(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMenu(PathMetadata metadata, PathInits inits) {
        this(Menu.class, metadata, inits);
    }

    public QMenu(Class<? extends Menu> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.displayInfo = inits.isInitialized("displayInfo") ? new be.shop.slow_delivery.common.domain.QDisplayInfo(forProperty("displayInfo"), inits.get("displayInfo")) : null;
        this.shop = inits.isInitialized("shop") ? new be.shop.slow_delivery.shop.domain.QShop(forProperty("shop"), inits.get("shop")) : null;
    }

}

