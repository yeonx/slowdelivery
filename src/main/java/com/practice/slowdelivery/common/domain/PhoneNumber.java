package com.practice.slowdelivery.common.domain;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class PhoneNumber {
    @Column(name="phone_number",nullable = false)
    private String value;

    public PhoneNumber(String phoneNumber){
        if(!phoneNumber.matches("\\d{2,3}-\\d{3,4}-\\d{4}"))
            throw new IllegalArgumentException("invalid phone number format");
        this.value = phoneNumber;
    }

    @Override
    public String toString(){
        return value;
    }

}
