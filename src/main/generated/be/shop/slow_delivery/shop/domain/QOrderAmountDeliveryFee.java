package be.shop.slow_delivery.shop.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderAmountDeliveryFee is a Querydsl query type for OrderAmountDeliveryFee
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderAmountDeliveryFee extends EntityPathBase<OrderAmountDeliveryFee> {

    private static final long serialVersionUID = -461938457L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderAmountDeliveryFee orderAmountDeliveryFee = new QOrderAmountDeliveryFee("orderAmountDeliveryFee");

    public final be.shop.slow_delivery.common.domain.QBaseTimeEntity _super = new be.shop.slow_delivery.common.domain.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final be.shop.slow_delivery.common.domain.QMoney fee;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final be.shop.slow_delivery.common.domain.QMoney orderAmount;

    public final QShop shop;

    public QOrderAmountDeliveryFee(String variable) {
        this(OrderAmountDeliveryFee.class, forVariable(variable), INITS);
    }

    public QOrderAmountDeliveryFee(Path<? extends OrderAmountDeliveryFee> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderAmountDeliveryFee(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderAmountDeliveryFee(PathMetadata metadata, PathInits inits) {
        this(OrderAmountDeliveryFee.class, metadata, inits);
    }

    public QOrderAmountDeliveryFee(Class<? extends OrderAmountDeliveryFee> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fee = inits.isInitialized("fee") ? new be.shop.slow_delivery.common.domain.QMoney(forProperty("fee")) : null;
        this.orderAmount = inits.isInitialized("orderAmount") ? new be.shop.slow_delivery.common.domain.QMoney(forProperty("orderAmount")) : null;
        this.shop = inits.isInitialized("shop") ? new QShop(forProperty("shop"), inits.get("shop")) : null;
    }

}

