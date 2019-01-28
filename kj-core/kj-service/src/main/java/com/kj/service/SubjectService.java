package com.kj.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kj.mapper.SubjectListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectListMapper  subjectListMapper;


    public PageInfo getSubjectList(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        List<Object> subjectList = subjectListMapper.listSubject();
        PageInfo pageInfo = new PageInfo(subjectList);

        return pageInfo;
    }

}
