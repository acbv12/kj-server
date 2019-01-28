package com.kj.model.POJO;

import com.kj.model.BaseEntity;
import javax.persistence.*;

@Table(name = "voucher_list")
public class VoucherList extends BaseEntity {
    /**
     * 凭证id
     */
    @Id
    private Integer id;

    /**
     * 凭证状态
     */
    private Integer status;

    /**
     * 凭证名称
     */
    private String name;

    /**
     * 凭证类型
     */
    private Integer type;

    /**
     * 获取凭证id
     *
     * @return id - 凭证id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置凭证id
     *
     * @param id 凭证id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取凭证状态
     *
     * @return status - 凭证状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置凭证状态
     *
     * @param status 凭证状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取凭证名称
     *
     * @return name - 凭证名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置凭证名称
     *
     * @param name 凭证名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取凭证类型
     *
     * @return type - 凭证类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置凭证类型
     *
     * @param type 凭证类型
     */
    public void setType(Integer type) {
        this.type = type;
    }
}