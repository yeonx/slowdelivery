package com.practice.slowdelivery.exception;

public class NotFoundException extends BusinessException{
    public NotFoundException(ErrorCode errorCode){
        super(errorCode);
    }
}
