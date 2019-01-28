package com.kj.mapper;

import com.kj.common.util.MyMapper;
import com.kj.model.POJO.VoucherList;

import java.util.List;
import java.util.Map;

public interface VoucherListMapper extends MyMapper<VoucherList> {
    List<Object> listVoucher();
}