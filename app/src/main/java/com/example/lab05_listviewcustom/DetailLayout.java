package com.example.lab05_listviewcustom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab05_listviewcustom.model.Product;

import java.text.DecimalFormat;

public class DetailLayout extends AppCompatActivity {

    private ImageView imgProduct;
    private TextView tvProductName,tvProductDesc,tvProductPrice,tvOrderQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_layout);

        Intent intent = getIntent();

        Product product = (Product) intent.getSerializableExtra("product");

        imgProduct = findViewById(R.id.detail_imgProduct);
        tvProductName = findViewById(R.id.detail_tvProductName);
        tvProductDesc = findViewById(R.id.detail_tvProductDesc);
        tvProductPrice = findViewById(R.id.detail_tvProductPrice);

        DecimalFormat df = new DecimalFormat("$#,###");

        imgProduct.setImageResource(product.getId());
        tvProductName.setText(product.getName());
        tvProductDesc.setText(product.getDesc());
        tvProductPrice.setText(df.format(product.getPrice()));


    }
}