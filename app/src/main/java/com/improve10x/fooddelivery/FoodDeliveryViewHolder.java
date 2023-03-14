package com.improve10x.fooddelivery;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.fooddelivery.databinding.SoupsitemBinding;

public class FoodDeliveryViewHolder extends RecyclerView.ViewHolder {
    SoupsitemBinding binding;
    public FoodDeliveryViewHolder(SoupsitemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
