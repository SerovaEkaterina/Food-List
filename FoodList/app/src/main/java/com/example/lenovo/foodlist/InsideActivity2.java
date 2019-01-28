package com.example.lenovo.foodlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class InsideActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside2);

        ImageView food_photo;
        TextView tv_name, tv_c,descrip_tion;

        food_photo = findViewById(R.id.food_photo);
        tv_name = findViewById(R.id.food_name);
        tv_c = findViewById(R.id.food_c);
        descrip_tion = findViewById(R.id.description);

        food_photo.setImageResource(Integer.parseInt(String.valueOf(getIntent().getExtras().getInt("foodphoto"))));
        tv_c.setText(getIntent().getExtras().getString("cname"));
        tv_name.setText(getIntent().getExtras().getString("foodname"));
        descrip_tion.setText(getIntent().getExtras().getString("descrip"));
}

}
