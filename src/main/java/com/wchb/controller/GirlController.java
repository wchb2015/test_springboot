package com.wchb.controller;

import com.wchb.domain.Girl;
import com.wchb.domain.HttpResult;
import com.wchb.utils.HttpResultUtil;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/girl")
public class GirlController {

    /**
     * 添加一个女生
     *
     * @return
     */
    @PostMapping(value = "/add")
    public HttpResult<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return HttpResultUtil.error(400, bindingResult.getFieldError().getDefaultMessage());
        }
        return HttpResultUtil.success(girl);
    }
}
