package com.kj.app.api.controller;

import com.github.pagehelper.PageInfo;
import com.kj.common.constant.model.ApiResultModel;
import com.kj.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @GetMapping("/getSubjectList")
    public ApiResultModel getSubjectList(ModelMap modelMap, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "20") Integer rows) {

        PageInfo pageInfo =  subjectService.getSubjectList(page,rows);
        modelMap.put("page", pageInfo);

        return ApiResultModel.okResult(modelMap);
    }
}
