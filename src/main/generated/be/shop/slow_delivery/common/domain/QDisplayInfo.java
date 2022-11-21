package be.shop.slow_delivery.common.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDisplayInfo is a Querydsl query type for DisplayInfo
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QDisplayInfo extends BeanPath<DisplayInfo> {

    private static final long serialVersionUID = 1145234816L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDisplayInfo displayInfo = new QDisplayInfo("displayInfo");

    public final QDisplayOrder displayOrder;

    public final BooleanPath isDisplay = createBoolean("isDisplay");

    public QDisplayInfo(String variable) {
        this(DisplayInfo.class, forVariable(variable), INITS);
    }

    public QDisplayInfo(Path<? extends DisplayInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDisplayInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDisplayInfo(PathMetadata metadata, PathInits inits) {
        this(DisplayInfo.class, metadata, inits);
    }

    public QDisplayInfo(Class<? extends DisplayInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.displayOrder = inits.isInitialized("displayOrder") ? new QDisplayOrder(forProperty("displayOrder")) : null;
    }

}

