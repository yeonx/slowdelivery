package com.practice.slowdelivery.shop.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class BusinessTimeInfo {
    @Column(name="opening_hours",nullable = false)
    private String openingHours;

    @Column(name="days_off",nullable = false)
    private String dayOff;

    @Builder
    public BusinessTimeInfo(String openingHours,String dayOff){
        this.openingHours = openingHours;
        this.dayOff = dayOff;
    }

}
