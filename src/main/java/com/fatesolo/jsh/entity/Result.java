package com.fatesolo.jsh.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Result {

    private String code;

    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static Result success(String msg) {
        Result result = new Result();

        result.setCode("SUCCESS");
        result.setMsg(msg);

        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result failure(String msg) {
        Result result = new Result();

        result.setCode("FAILURE");
        result.setMsg(msg);

        return result;
    }

    public static Result failure() {
        return failure(null);
    }

}
