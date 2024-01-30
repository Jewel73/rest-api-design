package com.jewel.ecom.exception;

import java.io.Serial;

public class ItemNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    private final String errMsgKey;
    private final String errorCode;

    public ItemNotFoundException(ErrorCode code) {
        super(code.getErrorMsgKey());
        this.errMsgKey = code.getErrorMsgKey();
        this.errorCode = code.getErrorCode();
    }

    public ItemNotFoundException(final String message) {
        super(message);
        this.errMsgKey = ErrorCode.CUSTOMER_NOT_FOUND.getErrorMsgKey();
        this.errorCode = ErrorCode.CUSTOMER_NOT_FOUND.getErrorCode();
    }

    public String getErrMsgKey() {
        return errMsgKey;
    }

    public String getErrorCode() {
        return errorCode;
    }
}