package com.kj.service;

import com.kj.mapper.AppUserMapper;
import com.kj.model.POJO.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    @Autowired
    private AppUserMapper  appUserMapper;

    /**
     * 根据ID查找用户
     * @param id
     * @return
     */
    public AppUser findById(Integer id) {
        return appUserMapper.getUserInfoById(id);
    }
}
