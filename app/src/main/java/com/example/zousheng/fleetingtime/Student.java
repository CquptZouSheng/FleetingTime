package com.example.zousheng.fleetingtime;

/**
 * Created by Zou Sheng on 2016/3/19.
 */
public class Student {
    private String name,number,telephone,qq;
    public Student(String name,String number,String telephone,String qq) {
        this.name=name;
        this.number=number;
        this.telephone=telephone;
        this.qq=qq;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getQq() {
        return qq;
    }

}
