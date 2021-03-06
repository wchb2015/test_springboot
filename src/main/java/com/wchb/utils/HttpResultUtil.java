package com.wchb.utils;


import com.wchb.domain.HttpResult;

public class HttpResultUtil {

    public static HttpResult success(Object object) {
        return new HttpResult(200, "SUCCESS", object);
    }

    public static HttpResult error(Integer code, String msg) {
        return new HttpResult(code, msg, null);
    }

}
