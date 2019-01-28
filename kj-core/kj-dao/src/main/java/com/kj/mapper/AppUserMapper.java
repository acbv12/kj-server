package com.kj.mapper;

import com.kj.common.util.MyMapper;
import com.kj.model.POJO.AppUser;

public interface AppUserMapper extends MyMapper<AppUser> {
    AppUser getUserInfoById(Integer id);
}