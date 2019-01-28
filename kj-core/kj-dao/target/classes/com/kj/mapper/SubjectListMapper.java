package com.kj.mapper;

import com.kj.common.util.MyMapper;
import com.kj.model.POJO.SubjectList;

import java.util.List;

public interface SubjectListMapper extends MyMapper<SubjectList> {
    List<Object> listSubject();
}