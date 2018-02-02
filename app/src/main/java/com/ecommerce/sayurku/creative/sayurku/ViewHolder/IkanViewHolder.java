package com.ecommerce.sayurku.creative.sayurku.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ecommerce.sayurku.creative.sayurku.Interface.ItemClickListener;
import com.ecommerce.sayurku.creative.sayurku.R;

/**
 * Created by MRX on 29/01/2018.
 */

public class IkanViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView food_name;
    public TextView food_price;
    public ImageView food_image;
    private ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public IkanViewHolder(View itemView) {
        super(itemView);

        food_name = (TextView)itemView.findViewById(R.id.food_name);
        food_price = (TextView)itemView.findViewById(R.id.food_price);
        food_image = (ImageView)itemView.findViewById(R.id.food_image);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }
}