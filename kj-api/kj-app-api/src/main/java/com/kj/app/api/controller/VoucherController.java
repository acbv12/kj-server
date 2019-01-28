package com.kj.app.api.controller;

import com.github.pagehelper.PageInfo;
import com.kj.common.constant.model.ApiResultModel;
import com.kj.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/v1/api/voucher")

public class VoucherController {

    @Autowired
    private VoucherService voucherService;

    @GetMapping("/getVoucherTagList")
    public ApiResultModel getVoucherTagList(ModelMap modelMap,@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "20") Integer rows) {

        PageInfo pageInfo =  voucherService.getVoucherList(page,rows);
        modelMap.put("page", pageInfo);

        return ApiResultModel.okResult(modelMap);
    }

    @GetMapping("/getVoucherDetail")
    public ApiResultModel getVoucherDetail(ModelMap modelMap,@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "20") Integer rows) {

        PageInfo pageInfo =  voucherService.getVoucherList(page,rows);
        modelMap.put("page", pageInfo);

        return ApiResultModel.okResult(modelMap);
    }

    @PostMapping("/addVoucher")
    public ApiResultModel addStoreStyle(@RequestBody Map<String, String> map) {

        return ApiResultModel.ok();
    }
}
