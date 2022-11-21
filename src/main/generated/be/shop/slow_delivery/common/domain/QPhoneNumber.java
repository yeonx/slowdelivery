package be.shop.slow_delivery.common.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPhoneNumber is a Querydsl query type for PhoneNumber
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPhoneNumber extends BeanPath<PhoneNumber> {

    private static final long serialVersionUID = -1761747129L;

    public static final QPhoneNumber phoneNumber1 = new QPhoneNumber("phoneNumber1");

    public final StringPath phoneNumber = createString("phoneNumber");

    public QPhoneNumber(String variable) {
        super(PhoneNumber.class, forVariable(variable));
    }

    public QPhoneNumber(Path<? extends PhoneNumber> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPhoneNumber(PathMetadata metadata) {
        super(PhoneNumber.class, metadata);
    }

}

