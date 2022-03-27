package com.example.lab05_listviewcustom.adapter;

import android.content.Context;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.lab05_listviewcustom.DetailLayout;
import com.example.lab05_listviewcustom.R;
import com.example.lab05_listviewcustom.model.Product;

import java.text.DecimalFormat;
import java.util.List;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private int positionSelect = -1;
    private List<Product> productList;

    public ProductAdapter(Context context, int idLayout, List<Product> productList) {
        this.context = context;
        this.idLayout = idLayout;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        if (productList.size() != 0 && !productList.isEmpty())
            return productList.size();
        return 0;
    }


    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(idLayout, viewGroup, false);
        }
        ImageView imgProduct = view.findViewById(R.id.item_lv_productImage);
        TextView tvProductName = view.findViewById(R.id.item_lv_productName);
        TextView tvProductDesc = view.findViewById(R.id.item_lv_description);
        TextView tvProductPrice = view.findViewById(R.id.item_lv_price);


        final ConstraintLayout constraintLayout = view.findViewById(R.id.item_custom_list_view);
        final Product product = productList.get(i);
        DecimalFormat df = new DecimalFormat("$#,###.##");

        if (productList.size() != 0 && !productList.isEmpty()) {
            tvProductName.setText(product.getName());
            tvProductDesc.setText(product.getDesc());
            tvProductPrice.setText(df.format(product.getPrice()));
            imgProduct.setImageResource(product.getId());

        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, DetailLayout.class);
                intent.putExtra("product", product);
                context.startActivity(intent);

            }
        });

        return view;
    }
}
