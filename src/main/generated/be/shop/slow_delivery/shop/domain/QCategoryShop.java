package be.shop.slow_delivery.shop.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCategoryShop is a Querydsl query type for CategoryShop
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCategoryShop extends EntityPathBase<CategoryShop> {

    private static final long serialVersionUID = 1781211631L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCategoryShop categoryShop = new QCategoryShop("categoryShop");

    public final NumberPath<Long> categoryId = createNumber("categoryId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QShop shop;

    public QCategoryShop(String variable) {
        this(CategoryShop.class, forVariable(variable), INITS);
    }

    public QCategoryShop(Path<? extends CategoryShop> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCategoryShop(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCategoryShop(PathMetadata metadata, PathInits inits) {
        this(CategoryShop.class, metadata, inits);
    }

    public QCategoryShop(Class<? extends CategoryShop> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shop = inits.isInitialized("shop") ? new QShop(forProperty("shop"), inits.get("shop")) : null;
    }

}

