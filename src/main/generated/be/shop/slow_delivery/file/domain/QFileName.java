package be.shop.slow_delivery.file.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFileName is a Querydsl query type for FileName
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QFileName extends BeanPath<FileName> {

    private static final long serialVersionUID = -2103673080L;

    public static final QFileName fileName = new QFileName("fileName");

    public final StringPath originalFileName = createString("originalFileName");

    public final StringPath storedFileName = createString("storedFileName");

    public QFileName(String variable) {
        super(FileName.class, forVariable(variable));
    }

    public QFileName(Path<? extends FileName> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFileName(PathMetadata metadata) {
        super(FileName.class, metadata);
    }

}

