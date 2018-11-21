package com.kj.common.constant.enums.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * API接口返回编码
 *
 * @author Rain
 * @create 2017-05-11 14:49
 */
@AllArgsConstructor
@Getter
public enum ApiResultCodeEnum {

    SUCCESS("0", "ok"),

    FAILURE("-1", "failure"),

    TOKEN_ERROR("10", "Token无效"),

    WECHAT_AUTHORIZATION_ERROR("11", "微信未授权"),

    SEND_INVITATION_SUCCESS("101", "邀请成功"),

    SEND_INVITATION_FAILURE("102", "邀请失败"),

    ACCEPT_INVITATION_SUCCESS("121", "接受邀请成功"),

    ACCEPT_INVITATION_FAILURE("122", "接受邀请失败"),

    ORDER_MORE_PRODUCT_INVALID("201", "订单内有商品已失效"),

    ORDER_ONE_PRODUCT_INVALID("202", "商品已失效"),

    IS_FOLLOWED_STORE_STAFF("301", "已关注门店或导购");

    private String code;

    private String message;

//    ApiResultCodeEnum(String code, String message) {
//        this.code = code;
//        this.message = message;
//    }
//    public String getCode() {
//        return code;
//    }
//    public String getMessage() {
//        return message;
//    }


}