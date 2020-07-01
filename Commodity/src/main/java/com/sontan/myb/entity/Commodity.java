package com.sontan.myb.entity;

import java.util.Date;

public class Commodity {
    private Integer id;
    private String pro_name;
    private String pro_model;
    private String pro_price;
    private Date createtime;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", pro_name='" + pro_name + '\'' +
                ", pro_model='" + pro_model + '\'' +
                ", pro_price='" + pro_price + '\'' +
                ", createtime=" + createtime +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_model() {
        return pro_model;
    }

    public void setPro_model(String pro_model) {
        this.pro_model = pro_model;
    }

    public String getPro_price() {
        return pro_price;
    }

    public void setPro_price(String pro_price) {
        this.pro_price = pro_price;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Commodity(Integer id, String pro_name, String pro_model, String pro_price, Date createtime) {
        this.id = id;
        this.pro_name = pro_name;
        this.pro_model = pro_model;
        this.pro_price = pro_price;
        this.createtime = createtime;
    }

    public Commodity() {
    }
}
