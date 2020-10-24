package com.example.voanhnguyen_sales.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.voanhnguyen_sales.R;
import com.example.voanhnguyen_sales.model.Product;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by minhc_000 on 12/08/2015.
 */
public class ProductAdapter  extends ArrayAdapter {
    Activity activity;//activity chứa listview
    public ProductAdapter(Activity activity, ArrayList products) {
        super(activity, 0, products);
        this.activity = activity;
    }

    //hàm hiện thị từng item lên listview
    public View getView(int position, View convertView, ViewGroup viewGroup)
    {
        //position là vị tri của mỗi item. nó sẽ chạy hết mảng
        //lấy layout cho từng item
        if (convertView == null)
        {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.listitem_product, null);
        }
        //lấy các textview trong mỗi view
        ImageView tv_color = (ImageView)convertView.findViewById(R.id.tv_color);
        TextView tv_name = (TextView)convertView.findViewById(R.id.tv_name);
        TextView tv_number = (TextView)convertView.findViewById(R.id.tv_number);
        //hiển thị dư liệu lên từng item của listview ở vị trí position
        Product p = (Product) getItem(position);
        tv_color.setImageResource(p.getmImage());
        tv_name.setText(p.getmName());
        tv_number.setText(p.getmNumber());
        return convertView;//trả về 1 view khi đã thiết đặt xong
    }
}