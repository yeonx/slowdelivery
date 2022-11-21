package be.shop.slow_delivery.product.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductIngredientGroup is a Querydsl query type for ProductIngredientGroup
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductIngredientGroup extends EntityPathBase<ProductIngredientGroup> {

    private static final long serialVersionUID = 834934241L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductIngredientGroup productIngredientGroup = new QProductIngredientGroup("productIngredientGroup");

    public final be.shop.slow_delivery.common.domain.QBaseTimeEntity _super = new be.shop.slow_delivery.common.domain.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final be.shop.slow_delivery.common.domain.QDisplayOrder displayOrder;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QIngredientGroup ingredientGroup;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final QProduct product;

    public QProductIngredientGroup(String variable) {
        this(ProductIngredientGroup.class, forVariable(variable), INITS);
    }

    public QProductIngredientGroup(Path<? extends ProductIngredientGroup> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductIngredientGroup(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductIngredientGroup(PathMetadata metadata, PathInits inits) {
        this(ProductIngredientGroup.class, metadata, inits);
    }

    public QProductIngredientGroup(Class<? extends ProductIngredientGroup> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.displayOrder = inits.isInitialized("displayOrder") ? new be.shop.slow_delivery.common.domain.QDisplayOrder(forProperty("displayOrder")) : null;
        this.ingredientGroup = inits.isInitialized("ingredientGroup") ? new QIngredientGroup(forProperty("ingredientGroup"), inits.get("ingredientGroup")) : null;
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

