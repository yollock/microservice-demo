package com.yollock.order.response;

import java.io.Serializable;

/**
 * 简单示例, 生产中, 可能要继承功能类, 扩展
 *
 * @param <T>
 */
public class Response<T> implements Serializable {

    private Integer code;
    private String message;
    private T result;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public Response code(Integer code) {
        this.code = code;
        return this;
    }

    public Response message(String message) {
        this.message = message;
        return this;
    }

    public Response result(T result) {
        this.result = result;
        return this;
    }
}
