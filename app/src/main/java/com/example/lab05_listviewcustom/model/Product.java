package com.example.lab05_listviewcustom.model;

import java.io.Serializable;

public class Product implements Serializable   {
    private int id;
    private String name;
    private double price;
    private String desc;

    public Product(int id, String name, double price, String desc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
