package com.wchb.utils;

import com.wchb.domain.HttpResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionConvertUtil {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public HttpResult handle(Exception e) {
        return HttpResultUtil.error(100, e.getMessage());
    }

}
