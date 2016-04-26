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

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
}
