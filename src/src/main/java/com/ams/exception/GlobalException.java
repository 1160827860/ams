package com.ams.exception;

import com.ams.result.CodeMsg;

/**
 * @Author: rui
 * @Version 0.0.1
 * @Date: 2020/3/21
 */
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private CodeMsg cm;

    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;
    }

    public CodeMsg getCm() {
        return cm;
    }
}