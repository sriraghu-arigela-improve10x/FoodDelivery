package com.improve10x.fooddelivery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.fooddelivery.databinding.SoupsitemBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class FoodDeliveryAdapter extends RecyclerView.Adapter<FoodDeliveryViewHolder> {

    private ArrayList<FoodDelivery> foodDeliveries;

     void setupData(ArrayList<FoodDelivery> foodDeliveryList) {
        foodDeliveries = foodDeliveryList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FoodDeliveryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        SoupsitemBinding binding = SoupsitemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        FoodDeliveryViewHolder foodDeliveryViewHolder = new FoodDeliveryViewHolder(binding);
        return foodDeliveryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodDeliveryViewHolder holder, int position) {
        FoodDelivery foodDelivery = foodDeliveries.get(position);
        Picasso.get().load(foodDelivery.imageUrl).into(holder.binding.imageImg);
        holder.binding.itemTxt.setText(foodDelivery.item);
        holder.binding.orderlistTxt.setText(foodDelivery.orderList);
        holder.binding.textTxt.setText(foodDelivery.text);
        holder.binding.weightTxt.setText(foodDelivery.weight);
        holder.binding.priceTxt.setText(foodDelivery.price);
        holder.binding.addItemTxt.setText(foodDelivery.addItem);
    }

    @Override
    public int getItemCount() {
        return foodDeliveries.size();
    }
}
