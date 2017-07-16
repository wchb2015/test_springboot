package com.wchb.controller;

import com.wchb.domain.HttpResult;
import com.wchb.domain.User;
import com.wchb.utils.HttpResultUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = {"logIn"}, method = RequestMethod.POST)
    public HttpResult logIn(User user) throws Exception {

        if ("admin".equals(user.getUserName()) && "111111".equals(user.getPassword())) {
            return HttpResultUtil.success(user);
        } else {
            return HttpResultUtil.error(400, "不存在该用户");
        }

    }
}
