package com.ams.result;

/**
 * @Author: rui
 * @Version 0.0.1
 * @Date: 2020/3/21
 */
public class Result <T> {
    //TODO:返回对象构成和前端不匹配
    /**
     * 响应码
     */
    private int code;

    /**
     * 相应码对应的响应信息
     */
    private String msg;

    /**
     * 携带的数据
     */
    private T data;

    /**
     * 成功时候的调用
     * */
    public static <T> Result<T> success(T data){
        return new  Result<T>(data);
    }

    /**
     * 失败时候的调用
     * */
    public static <T> Result<T> error(CodeMsg cm){
        return new  Result<T>(cm);
    }

    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    private Result(CodeMsg cm) {
        if(cm == null) {
            return;
        }
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
    public T getData() {
        return data;
    }
}
