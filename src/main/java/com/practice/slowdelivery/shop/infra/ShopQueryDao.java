package com.practice.slowdelivery.shop.infra;

import com.practice.slowdelivery.shop.application.dto.QShopDetailInfo;
import com.practice.slowdelivery.shop.application.dto.QShopSimpleInfo;
import com.practice.slowdelivery.shop.application.dto.ShopDetailInfo;
import com.practice.slowdelivery.shop.application.dto.ShopSimpleInfo;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.practice.slowdelivery.exception.ErrorCode.SHOP_NOT_FOUND;
import static com.practice.slowdelivery.file.domain.QFile.file;
import static com.practice.slowdelivery.shop.domain.QCategoryShop.categoryShop;
import static com.practice.slowdelivery.shop.domain.QOrderAmountDeliveryFee.orderAmountDeliveryFee;
import static com.practice.slowdelivery.shop.domain.QShop.shop;
import static com.querydsl.core.group.GroupBy.groupBy;
import static com.querydsl.core.group.GroupBy.list;
import static java.util.stream.Collectors.groupingBy;

@RequiredArgsConstructor
@Repository
public class ShopQueryDao {
    private final JPAQueryFactory queryFactory;

    //단건 가게 간략 정보
    public Optional<ShopSimpleInfo> findSimpleInfo(long shopId){
        return Optional.ofNullable(
                queryFactory
                        .from(shop)
                        .where(shop.id.eq(shopId))
                        .leftJoin(file).on(file.id.eq(shop.shopThumbnailFiledId))
                        .leftJoin(orderAmountDeliveryFee).on(orderAmountDeliveryFee.shop.eq(shop))
                        .transform(
                                groupBy(shop.id).as(
                                    new QShopSimpleInfo(shop.id,shop.name,shop.minOrderAmount.value,file.filePath,
                                            list(orderAmountDeliveryFee.fee.value))
                                )
                        ).get(shopId)
        );
    }

    //단 건 가게 상세 정보
    public Optional<ShopDetailInfo> findDetailInfo(long shopId){
        return Optional.ofNullable(
                queryFactory
                        .from(shop)
                        .where(shop.id.eq(shopId))
                        .leftJoin(file).on(file.id.eq(shop.shopThumbnailFiledId))
                        .leftJoin(orderAmountDeliveryFee).on(orderAmountDeliveryFee.shop.eq(shop))
                        .transform(
                                groupBy(shop.id).as(
                                        new QShopDetailInfo(shop,file.filePath,list(orderAmountDeliveryFee.fee.value))
                                )
                        ).get(shopId)
        );
    }


}
