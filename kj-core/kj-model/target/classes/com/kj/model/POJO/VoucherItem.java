package com.kj.model.POJO;

import com.kj.model.BaseEntity;
import javax.persistence.*;

@Table(name = "voucher_item")
public class VoucherItem extends BaseEntity {
    @Id
    private Integer id;

    /**
     * 凭证编号
关联凭证信息
     */
    @Column(name = "voucher_code")
    private Integer voucherCode;

    /**
     * 摘要
     */
    private String desc;

    /**
     * 科目类型编号
     */
    @Column(name = "voucher_type")
    private String voucherType;

    /**
     * 科目名称
     */
    @Column(name = "voucher_name")
    private String voucherName;

    /**
     * 收入
     */
    private Float income;

    /**
     * 支出
     */
    private Float expenditure;

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
关联凭证信息
     *
     * @return voucher_code - 凭证编号
关联凭证信息
     */
    public Integer getVoucherCode() {
        return voucherCode;
    }

    /**
     * 设置凭证编号
关联凭证信息
     *
     * @param voucherCode 凭证编号
关联凭证信息
     */
    public void setVoucherCode(Integer voucherCode) {
        this.voucherCode = voucherCode;
    }

    /**
     * 获取摘要
     *
     * @return desc - 摘要
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置摘要
     *
     * @param desc 摘要
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 获取科目类型编号
     *
     * @return voucher_type - 科目类型编号
     */
    public String getVoucherType() {
        return voucherType;
    }

    /**
     * 设置科目类型编号
     *
     * @param voucherType 科目类型编号
     */
    public void setVoucherType(String voucherType) {
        this.voucherType = voucherType;
    }

    /**
     * 获取科目名称
     *
     * @return voucher_name - 科目名称
     */
    public String getVoucherName() {
        return voucherName;
    }

    /**
     * 设置科目名称
     *
     * @param voucherName 科目名称
     */
    public void setVoucherName(String voucherName) {
        this.voucherName = voucherName;
    }

    /**
     * 获取收入
     *
     * @return income - 收入
     */
    public Float getIncome() {
        return income;
    }

    /**
     * 设置收入
     *
     * @param income 收入
     */
    public void setIncome(Float income) {
        this.income = income;
    }

    /**
     * 获取支出
     *
     * @return expenditure - 支出
     */
    public Float getExpenditure() {
        return expenditure;
    }

    /**
     * 设置支出
     *
     * @param expenditure 支出
     */
    public void setExpenditure(Float expenditure) {
        this.expenditure = expenditure;
    }
}