package com.kj.model.POJO;

import com.kj.model.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "voucher_info")
public class VoucherInfo extends BaseEntity {
    @Id
    private Integer id;

    /**
     * 凭证编号
关联凭证item
     */
    @Column(name = "voucher_code")
    private String voucherCode;

    /**
     * 凭证状态
     */
    private Integer status;

    /**
     * 凭证更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 凭证创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 凭证审核时间
     */
    @Column(name = "check_time")
    private Date checkTime;

    /**
     * 凭证上填写的时间
     */
    private Date date;

    /**
     * 备注
     */
    private String remark;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取凭证编号
关联凭证item
     *
     * @return voucher_code - 凭证编号
关联凭证item
     */
    public String getVoucherCode() {
        return voucherCode;
    }

    /**
     * 设置凭证编号
关联凭证item
     *
     * @param voucherCode 凭证编号
关联凭证item
     */
    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
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
     * 获取凭证更新时间
     *
     * @return update_time - 凭证更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置凭证更新时间
     *
     * @param updateTime 凭证更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取凭证创建时间
     *
     * @return create_time - 凭证创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置凭证创建时间
     *
     * @param createTime 凭证创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取凭证审核时间
     *
     * @return check_time - 凭证审核时间
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * 设置凭证审核时间
     *
     * @param checkTime 凭证审核时间
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * 获取凭证上填写的时间
     *
     * @return date - 凭证上填写的时间
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置凭证上填写的时间
     *
     * @param date 凭证上填写的时间
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}