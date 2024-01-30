package com.jewel.ecom.exception;

public enum ErrorCode {
    GENERIC_ERROR("ECOM-0001", "The system is unable to complete the request"),
    HTTP_MEDIATYPE_NOT_SUPPORTED("ECOM-0002", "Requested media type is not supported please use: application/json or xml"),
    HTTP_MEDIA_TYPE_NOT_ACCEPTABLE("ECOM-0004", "Requested 'Accept' header value is not supported. Please use application/json or application/xml as 'Accept' "),
    HTTP_MESSAGE_NOT_READABLE("ECOM-0006", "Make sure request payload should be a valid JSON or XML object according to 'Content-Type' "),
    HTTP_MESSAGE_NOT_WRITABLE("ECOM-0003", "Missing 'Accept' header. Please add 'Accept' header"),
    JSON_PARSE_ERROR("ECOM-0005", "Make sure request payload should be a valid JSON object."),
    RESOURCE_NOT_FOUND("ECOM-0006", "Requested resource not found"),
    CUSTOMER_NOT_FOUND("ECOM-0007", "Requested customer not found"),;

    private String errorCode;
    private String errorMsgKey;

    ErrorCode(String errorCode, String errorMsgKey) {
        this.errorCode = errorCode;
        this.errorMsgKey = errorMsgKey;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsgKey() {
        return errorMsgKey;
    }
}
