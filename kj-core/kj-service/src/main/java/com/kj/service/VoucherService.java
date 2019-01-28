package com.kj.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kj.mapper.VoucherListMapper;
import com.kj.mapper.VoucherInfoMapper;
import com.kj.mapper.VoucherItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VoucherService {
    @Autowired
    private VoucherListMapper  voucherListMapper;

    @Autowired
    private VoucherInfoMapper  voucherInfoMapper;

    @Autowired
    private VoucherItemMapper  voucherItemMapper;

    public PageInfo getVoucherList(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        List<Object> voucherList = voucherListMapper.listVoucher();
        PageInfo pageInfo = new PageInfo(voucherList);

        return pageInfo;
    }
}
