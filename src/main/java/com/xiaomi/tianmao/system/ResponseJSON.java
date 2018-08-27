package com.xiaomi.tianmao.system;

/**
 * 统一返回格式
 */
public class ResponseJSON {
    private int code;
    private String msg;
    private Object data;


    public ResponseJSON() {
    }

    public ResponseJSON(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
