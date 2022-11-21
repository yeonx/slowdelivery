package be.shop.slow_delivery.common.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDisplayOrder is a Querydsl query type for DisplayOrder
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QDisplayOrder extends BeanPath<DisplayOrder> {

    private static final long serialVersionUID = 1148199100L;

    public static final QDisplayOrder displayOrder1 = new QDisplayOrder("displayOrder1");

    public final NumberPath<Integer> displayOrder = createNumber("displayOrder", Integer.class);

    public QDisplayOrder(String variable) {
        super(DisplayOrder.class, forVariable(variable));
    }

    public QDisplayOrder(Path<? extends DisplayOrder> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDisplayOrder(PathMetadata metadata) {
        super(DisplayOrder.class, metadata);
    }

}

