package be.shop.slow_delivery.shop.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QShopLocation is a Querydsl query type for ShopLocation
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QShopLocation extends BeanPath<ShopLocation> {

    private static final long serialVersionUID = -2123608666L;

    public static final QShopLocation shopLocation = new QShopLocation("shopLocation");

    public final NumberPath<Double> latitude = createNumber("latitude", Double.class);

    public final NumberPath<Long> localId = createNumber("localId", Long.class);

    public final NumberPath<Double> longitude = createNumber("longitude", Double.class);

    public final StringPath streetAddress = createString("streetAddress");

    public QShopLocation(String variable) {
        super(ShopLocation.class, forVariable(variable));
    }

    public QShopLocation(Path<? extends ShopLocation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QShopLocation(PathMetadata metadata) {
        super(ShopLocation.class, metadata);
    }

}

