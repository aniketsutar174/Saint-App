package com.example.app;

public class Model {
    private String header;
    private String desc;
    private int imgname;

    public void setHeader(String header) {
        this.header = header;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImgname(int imgname) {
        this.imgname = imgname;
    }

    public String getHeader() {
        return header;
    }

    public String getDesc() {
        return desc;
    }

    public int getImgname() {
        return imgname;
    }
}
