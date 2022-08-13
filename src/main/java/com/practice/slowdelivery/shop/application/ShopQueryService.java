package com.practice.slowdelivery.shop.application;

import com.practice.slowdelivery.exception.ErrorCode;
import com.practice.slowdelivery.exception.NotFoundException;
import com.practice.slowdelivery.shop.application.dto.ShopDetailInfo;
import com.practice.slowdelivery.shop.application.dto.ShopSimpleInfo;
import com.practice.slowdelivery.shop.infra.ShopQueryDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.practice.slowdelivery.exception.ErrorCode.SHOP_NOT_FOUND;

@RequiredArgsConstructor
@Service
public class ShopQueryService {

    private final ShopQueryDao shopQueryDao;

    @Transactional(readOnly = true)
    public ShopSimpleInfo findSimpleInfo(long shopId){
        return shopQueryDao.findSimpleInfo(shopId)
                .orElseThrow(() -> new NotFoundException(SHOP_NOT_FOUND));
    }

    @Transactional(readOnly = true)
    public ShopDetailInfo findDetailInfo(long shopId){
        return shopQueryDao.findDetailInfo(shopId)
                .orElseThrow(()-> new NotFoundException(SHOP_NOT_FOUND));
    }
}
