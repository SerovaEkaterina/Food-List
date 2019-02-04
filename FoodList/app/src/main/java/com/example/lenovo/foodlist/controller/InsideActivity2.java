package com.example.lenovo.foodlist.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.foodlist.R;
import com.example.lenovo.foodlist.utils.Constants;


public class InsideActivity2 extends AppCompatActivity {
    private ImageView food_photo;
    private TextView tv_name, tv_c,descrip_tion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside2);

        int foodPhotoImageResId = getIntent().getIntExtra(Constants.foodPhotoResIdExtra, 0);
        String countryName = getIntent().getStringExtra(Constants.countryNameExtra);
        String foodName = getIntent().getStringExtra(Constants.foodNameExtra);
        String foodDescription = getIntent().getStringExtra(Constants.foodDescriptionExtra);

        food_photo = findViewById(R.id.details_food_image);
        tv_name = findViewById(R.id.details_food_name);
        tv_c = findViewById(R.id.details_food_description);
        descrip_tion = findViewById(R.id.details_food_review);

        tv_c.setText(countryName);
        tv_name.setText(foodName);
        descrip_tion.setText(foodDescription);
        food_photo.setImageResource(foodPhotoImageResId);
}

}
