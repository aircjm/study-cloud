package com.aircjm.cloud.common;

/**
 * 返回实体类
 * @author aircjm
 */
public class Response<T> {

    private Integer code;

    private String msg;

    private T data;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public Response() {
    }

    public Response(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Response<String> fail(Integer code, String msg) {
        return new Response<>(code, msg, null);
    }

}
