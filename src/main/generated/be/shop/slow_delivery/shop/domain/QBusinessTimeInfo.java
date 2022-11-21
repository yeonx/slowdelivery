package be.shop.slow_delivery.shop.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBusinessTimeInfo is a Querydsl query type for BusinessTimeInfo
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QBusinessTimeInfo extends BeanPath<BusinessTimeInfo> {

    private static final long serialVersionUID = -1357103018L;

    public static final QBusinessTimeInfo businessTimeInfo = new QBusinessTimeInfo("businessTimeInfo");

    public final StringPath dayOff = createString("dayOff");

    public final StringPath openingHours = createString("openingHours");

    public QBusinessTimeInfo(String variable) {
        super(BusinessTimeInfo.class, forVariable(variable));
    }

    public QBusinessTimeInfo(Path<? extends BusinessTimeInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBusinessTimeInfo(PathMetadata metadata) {
        super(BusinessTimeInfo.class, metadata);
    }

}

