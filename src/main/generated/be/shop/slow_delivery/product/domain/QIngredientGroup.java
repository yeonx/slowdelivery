package be.shop.slow_delivery.product.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QIngredientGroup is a Querydsl query type for IngredientGroup
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QIngredientGroup extends EntityPathBase<IngredientGroup> {

    private static final long serialVersionUID = 1833437644L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QIngredientGroup ingredientGroup = new QIngredientGroup("ingredientGroup");

    public final be.shop.slow_delivery.common.domain.QBaseTimeEntity _super = new be.shop.slow_delivery.common.domain.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath name = createString("name");

    public final QSelectCount selectCount;

    public QIngredientGroup(String variable) {
        this(IngredientGroup.class, forVariable(variable), INITS);
    }

    public QIngredientGroup(Path<? extends IngredientGroup> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QIngredientGroup(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QIngredientGroup(PathMetadata metadata, PathInits inits) {
        this(IngredientGroup.class, metadata, inits);
    }

    public QIngredientGroup(Class<? extends IngredientGroup> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.selectCount = inits.isInitialized("selectCount") ? new QSelectCount(forProperty("selectCount"), inits.get("selectCount")) : null;
    }

}

