package com.kj.model.POJO;

import com.kj.model.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "app_user")
public class AppUser extends BaseEntity {
    @Id
    private Integer id;

    /**
     * 用户编号
     */
    @Column(name = "app_user_code")
    private String appUserCode;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 用户凭证
     */
    @Column(name = "user_token")
    private String userToken;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 存取时间
     */
    @Column(name = "access_time")
    private Date accessTime;

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
     * 获取用户编号
     *
     * @return app_user_code - 用户编号
     */
    public String getAppUserCode() {
        return appUserCode;
    }

    /**
     * 设置用户编号
     *
     * @param appUserCode 用户编号
     */
    public void setAppUserCode(String appUserCode) {
        this.appUserCode = appUserCode;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户密码
     *
     * @return user_password - 用户密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置用户密码
     *
     * @param userPassword 用户密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取用户手机号
     *
     * @return phone - 用户手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置用户手机号
     *
     * @param phone 用户手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取用户凭证
     *
     * @return user_token - 用户凭证
     */
    public String getUserToken() {
        return userToken;
    }

    /**
     * 设置用户凭证
     *
     * @param userToken 用户凭证
     */
    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取存取时间
     *
     * @return access_time - 存取时间
     */
    public Date getAccessTime() {
        return accessTime;
    }

    /**
     * 设置存取时间
     *
     * @param accessTime 存取时间
     */
    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }
}