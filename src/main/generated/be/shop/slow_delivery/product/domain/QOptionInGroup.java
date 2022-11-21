package be.shop.slow_delivery.product.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOptionInGroup is a Querydsl query type for OptionInGroup
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOptionInGroup extends EntityPathBase<OptionInGroup> {

    private static final long serialVersionUID = -1977416637L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOptionInGroup optionInGroup = new QOptionInGroup("optionInGroup");

    public final be.shop.slow_delivery.common.domain.QBaseTimeEntity _super = new be.shop.slow_delivery.common.domain.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final be.shop.slow_delivery.common.domain.QDisplayInfo displayInfo;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final QOption option;

    public final QOptionGroup optionGroup;

    public QOptionInGroup(String variable) {
        this(OptionInGroup.class, forVariable(variable), INITS);
    }

    public QOptionInGroup(Path<? extends OptionInGroup> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOptionInGroup(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOptionInGroup(PathMetadata metadata, PathInits inits) {
        this(OptionInGroup.class, metadata, inits);
    }

    public QOptionInGroup(Class<? extends OptionInGroup> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.displayInfo = inits.isInitialized("displayInfo") ? new be.shop.slow_delivery.common.domain.QDisplayInfo(forProperty("displayInfo"), inits.get("displayInfo")) : null;
        this.option = inits.isInitialized("option") ? new QOption(forProperty("option"), inits.get("option")) : null;
        this.optionGroup = inits.isInitialized("optionGroup") ? new QOptionGroup(forProperty("optionGroup"), inits.get("optionGroup")) : null;
    }

}

