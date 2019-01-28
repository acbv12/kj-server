package com.kj.model.POJO;

import com.kj.model.BaseEntity;
import javax.persistence.*;

@Table(name = "subject_list")
public class SubjectList extends BaseEntity {
    /**
     * 科目id
     */
    @Id
    private Integer id;

    /**
     * 科目状态
     */
    private Integer status;

    /**
     * 科目进出类型
进账/出账
     */
    private Integer type;

    /**
     * 科目名称
     */
    private String name;

    /**
     * 科目编号
与会计科目编号保持一致
     */
    @Column(name = "subject_code")
    private String subjectCode;

    /**
     * 获取科目id
     *
     * @return id - 科目id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置科目id
     *
     * @param id 科目id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取科目状态
     *
     * @return status - 科目状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置科目状态
     *
     * @param status 科目状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取科目进出类型
进账/出账
     *
     * @return type - 科目进出类型
进账/出账
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置科目进出类型
进账/出账
     *
     * @param type 科目进出类型
进账/出账
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取科目名称
     *
     * @return name - 科目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置科目名称
     *
     * @param name 科目名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取科目编号
与会计科目编号保持一致
     *
     * @return subject_code - 科目编号
与会计科目编号保持一致
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * 设置科目编号
与会计科目编号保持一致
     *
     * @param subjectCode 科目编号
与会计科目编号保持一致
     */
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }
}