package com.jewel.ecom.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorUtils {

    final static Logger log = LoggerFactory.getLogger(ErrorUtils.class);

    public static Error createError(final String errorCode, final String errMsgKey, final Integer httpStatusCode){
        log.info("error code : {}, errorMsg : {}", errorCode, errMsgKey);
        Error error = new Error();
        error.setErrorCode(errorCode);
        error.setMessage(errMsgKey);
        error.setStatus(httpStatusCode);

        return error;
    }

}
