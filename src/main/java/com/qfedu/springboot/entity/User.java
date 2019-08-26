package com.qfedu.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data // 自动生成对应的getter和setter方法
@ToString  //  重写toString方法
@NoArgsConstructor  //  生成无参的构造方法
@AllArgsConstructor  //  生成全参的构造方法
public class User {

    private Integer uid;
    private String phone;
    private String password;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
