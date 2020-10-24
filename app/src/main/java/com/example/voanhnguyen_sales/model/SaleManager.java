package com.example.voanhnguyen_sales.model;

import com.example.voanhnguyen_sales.R;

import java.util.ArrayList;

public class SaleManager {
    private ArrayList Products;

    public SaleManager() {
        Products = new ArrayList();
    }

    public ArrayList getProducts() {
        return Products;
    }

    public void setProducts(ArrayList products) {
        Products = products;
    }

    public void generateProducts() {
        Products.clear();
        Products.add(new Product(R.drawable.logoinstagram, "Võ Anh Nguyên", "088.919.xxxx"));
        Products.add(new Product(R.drawable.logoinstagram, "Võ Hoàng Lâm","099 991 2222"));
        Products.add(new Product(R.drawable.logoinstagram, "Võ Anh Nguyên", "088.919.xxxx"));
        Products.add(new Product(R.drawable.logoinstagram, "Võ Anh Nguyên", "088.919.xxxx"));
        Products.add(new Product(R.drawable.logoinstagram, "Võ Anh Nguyên", "088.919.xxxx"));
    }

    private static SaleManager saleManager;

    public static SaleManager get() {
        if (saleManager == null)
            saleManager = new SaleManager();
        return saleManager;
    }
}
