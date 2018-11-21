package com.kj.common.constant.model;

import com.kj.common.constant.enums.api.ApiResultCodeEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * API接口响应内容
 *
 * @create 2017-04-14 15:02
 */
@Setter
@Getter
@Accessors(chain = true)
public class ApiResultModel {

    /**
     * 响应代码
     */
    private String returnCode;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应内容
     */
    private Object returnContent;

    public ApiResultModel() {

    }

    public ApiResultModel(String message) {
        this.returnCode = ApiResultCodeEnum.SUCCESS.getCode();
        this.message = message;
    }

    public ApiResultModel(Object result) {
        this.returnCode = ApiResultCodeEnum.SUCCESS.getCode();
        this.message = ApiResultCodeEnum.SUCCESS.getMessage();
        this.returnContent = result;
    }

    public ApiResultModel(String returnCode, String message, Object result) {
        this.returnCode = returnCode;
        this.message = message;
        this.returnContent = result;
    }

    public ApiResultModel(String returnCode, String message) {
        this.returnCode = returnCode;
        this.message = message;
    }

    public static ApiResultModel ok(){
        return new ApiResultModel(ApiResultCodeEnum.SUCCESS.getCode(),ApiResultCodeEnum.SUCCESS.getMessage());
    }

    public static ApiResultModel okMsg(String message){
        return new ApiResultModel(ApiResultCodeEnum.SUCCESS.getCode(),message);
    }

    public static ApiResultModel okResult(Object result){
        return new ApiResultModel(ApiResultCodeEnum.SUCCESS.getCode(),ApiResultCodeEnum.SUCCESS.getMessage(), result);
    }

    public static ApiResultModel notOk(){
        return new ApiResultModel(ApiResultCodeEnum.FAILURE.getCode(),ApiResultCodeEnum.FAILURE.getMessage());
    }

    public static ApiResultModel notOkMsg(String message){
        return new ApiResultModel(ApiResultCodeEnum.FAILURE.getCode(),message);
    }
}