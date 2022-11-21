package be.shop.slow_delivery.product.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSelectCount is a Querydsl query type for SelectCount
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QSelectCount extends BeanPath<SelectCount> {

    private static final long serialVersionUID = 1746264849L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSelectCount selectCount = new QSelectCount("selectCount");

    public final be.shop.slow_delivery.common.domain.QQuantity maxCount;

    public final be.shop.slow_delivery.common.domain.QQuantity minCount;

    public QSelectCount(String variable) {
        this(SelectCount.class, forVariable(variable), INITS);
    }

    public QSelectCount(Path<? extends SelectCount> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSelectCount(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSelectCount(PathMetadata metadata, PathInits inits) {
        this(SelectCount.class, metadata, inits);
    }

    public QSelectCount(Class<? extends SelectCount> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.maxCount = inits.isInitialized("maxCount") ? new be.shop.slow_delivery.common.domain.QQuantity(forProperty("maxCount")) : null;
        this.minCount = inits.isInitialized("minCount") ? new be.shop.slow_delivery.common.domain.QQuantity(forProperty("minCount")) : null;
    }

}

