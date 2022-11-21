package be.shop.slow_delivery.shop.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShop is a Querydsl query type for Shop
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QShop extends EntityPathBase<Shop> {

    private static final long serialVersionUID = -1951552815L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShop shop = new QShop("shop");

    public final be.shop.slow_delivery.common.domain.QBaseTimeEntity _super = new be.shop.slow_delivery.common.domain.QBaseTimeEntity(this);

    public final QBusinessTimeInfo businessTimeInfo;

    public final ListPath<CategoryShop, QCategoryShop> categories = this.<CategoryShop, QCategoryShop>createList("categories", CategoryShop.class, QCategoryShop.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isOpen = createBoolean("isOpen");

    public final QShopLocation location;

    public final be.shop.slow_delivery.common.domain.QMoney minOrderAmount;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath name = createString("name");

    public final be.shop.slow_delivery.common.domain.QPhoneNumber phoneNumber;

    public final NumberPath<Long> thumbnailFileId = createNumber("thumbnailFileId", Long.class);

    public QShop(String variable) {
        this(Shop.class, forVariable(variable), INITS);
    }

    public QShop(Path<? extends Shop> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShop(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShop(PathMetadata metadata, PathInits inits) {
        this(Shop.class, metadata, inits);
    }

    public QShop(Class<? extends Shop> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.businessTimeInfo = inits.isInitialized("businessTimeInfo") ? new QBusinessTimeInfo(forProperty("businessTimeInfo")) : null;
        this.location = inits.isInitialized("location") ? new QShopLocation(forProperty("location")) : null;
        this.minOrderAmount = inits.isInitialized("minOrderAmount") ? new be.shop.slow_delivery.common.domain.QMoney(forProperty("minOrderAmount")) : null;
        this.phoneNumber = inits.isInitialized("phoneNumber") ? new be.shop.slow_delivery.common.domain.QPhoneNumber(forProperty("phoneNumber")) : null;
    }

}

