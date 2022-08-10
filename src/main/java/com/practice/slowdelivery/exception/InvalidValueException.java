package com.practice.slowdelivery.exception;

public class InvalidValueException extends BusinessException{
    public InvalidValueException(ErrorCode errorCode){super(errorCode);}
}
