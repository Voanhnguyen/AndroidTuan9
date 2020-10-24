package com.example.voanhnguyen_sales.model;

public class Product {
    private int mImage;
    private String mName;
    private String mNumber;
    public Product(int mImage, String mName, String mNumber) {
        this.mImage = mImage;
        this.mName = mName;
        this.mNumber = mNumber;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mColor) {
        this.mImage = mColor;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }
}
