package com.improve10x.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.improve10x.fooddelivery.databinding.ActivityFoodDeliveryBinding;

import java.util.ArrayList;

public class FoodDeliveryActivity extends AppCompatActivity {

    private ActivityFoodDeliveryBinding binding;
    private ArrayList<FoodDelivery> foodDeliveries;
    private RecyclerView foodDeliveryRv;
    private FoodDeliveryAdapter foodDeliveryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFoodDeliveryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Food Delivery");
        setupData();
        setupRv();
    }

    private void setupRv() {
        foodDeliveryRv = binding.deliveryRv;
        foodDeliveryRv.setLayoutManager(new LinearLayoutManager(this));
        foodDeliveryAdapter = new FoodDeliveryAdapter();
        foodDeliveryAdapter.setupData(foodDeliveries);
        foodDeliveryRv.setAdapter(foodDeliveryAdapter);
    }

    private void setupData() {
        foodDeliveries = new ArrayList<>();
        FoodDelivery chicken = new FoodDelivery();
        chicken.item = "chicken fry";
        chicken.orderList = "chicken fry, chicken lollipop";
        chicken.text ="serving 2";
        chicken.weight = "250.00";
        chicken.price = "150.55";
        chicken.addItem = "chicken lollipop";
        chicken.imageUrl = "https://www.sinamontales.com/dotcord/uploads/2020/04/Easy-Chicken-Fry-Recipe-.jpg";
        foodDeliveries.add(chicken);

        FoodDelivery fish = new FoodDelivery();
        fish.item = "fish curry";
        fish.orderList = "fish fry, fish curry";
        fish.text ="serving 3";
        fish.weight = "200.00";
        fish.price = "140.00";
        fish.addItem = "fish fry";
        fish.imageUrl = "https://www.google.com/search?q=fish+fry&rlz=1C1VDKB_enIN1016IN1017&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjbsfCHuNv9AhVK7DgGHeVIC0wQ_AUoAXoECAEQAw&biw=1746&bih=812&dpr=1.1#imgrc=66wdbnvvXXDRXM";
        foodDeliveries.add(fish);

        FoodDelivery meet = new FoodDelivery();
        meet.item = "meet fry";
        meet.orderList = "meet soup, meet curry,meet fry";
        meet.text ="serving 3";
        meet.weight = "350.00";
        meet.price = "725.50";
        meet.addItem = "meet soup";
        meet.imageUrl = "https://www.google.com/search?q=meet+fry&rlz=1C1VDKB_enIN1016IN1017&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiDorSot9v9AhUU8DgGHSEpC6IQ_AUoAXoECAIQAw&biw=1746&bih=812&dpr=1.1#imgrc=7aI128J8gh-ZGM";
        foodDeliveries.add(meet);


        FoodDelivery beaf = new FoodDelivery();
        beaf.item = "beaf curry";
        beaf.orderList = "beaf curry,beaf fry";
        beaf.text ="serving 4";
        beaf.weight = "100";
        beaf.price = "50.00";
        beaf.addItem = "beaf curry";
        beaf.imageUrl = "https://i0.wp.com/www.sujiscooking.com/wp-content/uploads/2018/12/Kerala-Beef-Roast-or-Beef-Ularthiyathu-1.jpg?fit=1100%2C1650&ssl=1";
        foodDeliveries.add(beaf);


        FoodDelivery veg = new FoodDelivery();
        veg.item = "potato fry";
        veg.orderList = "potato curry, potato fry";
        veg.text ="serving 5";
        veg.weight = "400.00";
        veg.price = "25";
        veg.addItem = "potato fry";
        veg.imageUrl = "https://www.sharmispassions.com/wp-content/uploads/2021/07/CoinPotatoFry5.jpg";
        foodDeliveries.add(veg);


    }
}