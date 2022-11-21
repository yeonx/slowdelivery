package be.shop.slow_delivery.product.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QStockInfo is a Querydsl query type for StockInfo
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStockInfo extends BeanPath<StockInfo> {

    private static final long serialVersionUID = 996744706L;

    public static final QStockInfo stockInfo = new QStockInfo("stockInfo");

    public final BooleanPath isSale = createBoolean("isSale");

    public final NumberPath<Long> stockId = createNumber("stockId", Long.class);

    public QStockInfo(String variable) {
        super(StockInfo.class, forVariable(variable));
    }

    public QStockInfo(Path<? extends StockInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStockInfo(PathMetadata metadata) {
        super(StockInfo.class, metadata);
    }

}

