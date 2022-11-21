package be.shop.slow_delivery.product.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QIngredientInGroup is a Querydsl query type for IngredientInGroup
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QIngredientInGroup extends EntityPathBase<IngredientInGroup> {

    private static final long serialVersionUID = -1674519449L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QIngredientInGroup ingredientInGroup = new QIngredientInGroup("ingredientInGroup");

    public final be.shop.slow_delivery.common.domain.QBaseTimeEntity _super = new be.shop.slow_delivery.common.domain.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final be.shop.slow_delivery.common.domain.QDisplayInfo displayInfo;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QIngredient ingredient;

    public final QIngredientGroup ingredientGroup;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public QIngredientInGroup(String variable) {
        this(IngredientInGroup.class, forVariable(variable), INITS);
    }

    public QIngredientInGroup(Path<? extends IngredientInGroup> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QIngredientInGroup(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QIngredientInGroup(PathMetadata metadata, PathInits inits) {
        this(IngredientInGroup.class, metadata, inits);
    }

    public QIngredientInGroup(Class<? extends IngredientInGroup> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.displayInfo = inits.isInitialized("displayInfo") ? new be.shop.slow_delivery.common.domain.QDisplayInfo(forProperty("displayInfo"), inits.get("displayInfo")) : null;
        this.ingredient = inits.isInitialized("ingredient") ? new QIngredient(forProperty("ingredient"), inits.get("ingredient")) : null;
        this.ingredientGroup = inits.isInitialized("ingredientGroup") ? new QIngredientGroup(forProperty("ingredientGroup"), inits.get("ingredientGroup")) : null;
    }

}

