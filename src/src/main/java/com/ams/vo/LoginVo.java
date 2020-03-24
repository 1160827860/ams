package com.ams.vo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * 登陆的抽象对象
 * @author darksoul_lzy
 * @date 2020/3/21
 * @version 0.0.1
 */
public class LoginVo {
    @NotNull
    @Length(min =11 ,max =14 )
    String userName;
    @NotNull
    @Length(min =6 ,max =25)
    String passWords;
    @NotNull
    @Length(max = 4,min = 4)
    String checkCode;

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWords() {
        return passWords;
    }

    public void setPassWords(String passWords) {
        this.passWords = passWords;
    }
}
