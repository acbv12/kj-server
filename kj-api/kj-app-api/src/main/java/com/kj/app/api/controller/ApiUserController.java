package com.kj.app.api.controller;

import com.kj.common.constant.model.ApiResultModel;
import com.kj.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/api")

public class ApiUserController {

    @Autowired
    private AppUserService appUserService;

    @GetMapping("/getUserInfo")
    public ApiResultModel getUserInfo(@RequestParam Integer id) {

        return ApiResultModel.okResult(appUserService.findById(id));
    }
}
