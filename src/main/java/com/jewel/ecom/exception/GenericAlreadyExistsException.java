package com.jewel.ecom.exception;

import java.io.Serial;

public class GenericAlreadyExistsException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    private final String errMsgKey;
    private final String errorCode;

    public GenericAlreadyExistsException(ErrorCode code) {
        super(code.getErrorMsgKey());
        this.errMsgKey = code.getErrorMsgKey();
        this.errorCode = code.getErrorCode();
    }

    public GenericAlreadyExistsException(final String message) {
        super(message);
        this.errMsgKey = ErrorCode.RESOURCE_NOT_FOUND.getErrorMsgKey();
        this.errorCode = ErrorCode.RESOURCE_NOT_FOUND.getErrorCode();
    }

    public String getErrMsgKey() {
        return errMsgKey;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
