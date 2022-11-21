package be.shop.slow_delivery.product.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOptionGroup is a Querydsl query type for OptionGroup
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOptionGroup extends EntityPathBase<OptionGroup> {

    private static final long serialVersionUID = 1176139944L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOptionGroup optionGroup = new QOptionGroup("optionGroup");

    public final be.shop.slow_delivery.common.domain.QBaseTimeEntity _super = new be.shop.slow_delivery.common.domain.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final be.shop.slow_delivery.common.domain.QQuantity maxSelectCount;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath name = createString("name");

    public QOptionGroup(String variable) {
        this(OptionGroup.class, forVariable(variable), INITS);
    }

    public QOptionGroup(Path<? extends OptionGroup> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOptionGroup(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOptionGroup(PathMetadata metadata, PathInits inits) {
        this(OptionGroup.class, metadata, inits);
    }

    public QOptionGroup(Class<? extends OptionGroup> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.maxSelectCount = inits.isInitialized("maxSelectCount") ? new be.shop.slow_delivery.common.domain.QQuantity(forProperty("maxSelectCount")) : null;
    }

}

