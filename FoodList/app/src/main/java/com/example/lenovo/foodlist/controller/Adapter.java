package com.example.lenovo.foodlist.controller;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.foodlist.R;
import com.example.lenovo.foodlist.modal.Item;
import com.example.lenovo.foodlist.utils.Constants;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    private List <Item> foodData;

    public Adapter(List<Item> foodData){
        this.foodData = foodData;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.card_item, parent, false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final myViewHolder holder, final int position) {
        final Context context = holder.itemView.getContext();
        final Item foodItem = foodData.get(position);
        Picasso picasso = new Picasso.Builder(context).build();

        picasso.load(foodItem.getFoodPhoto())
                .into(holder.foodPhotoImageResID);
        holder.foodName.setText(foodItem.getFoodName());
        holder.foodCountry.setText(foodItem.getCountryName());
        holder.foodRootCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,InsideActivity2.class);
                intent.putExtra(Constants.foodDescriptionExtra, foodItem.getDescription());
                intent.putExtra(Constants.countryNameExtra, foodItem.getCountryName());
                intent.putExtra(Constants.foodNameExtra, foodItem.getFoodName());
                intent.putExtra(Constants.foodPhotoResIdExtra, foodItem.getFoodPhoto());
                context.startActivity(intent);
            }
        });
        holder.foodRootCard.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                foodData.remove(position);
                notifyDataSetChanged();
                return false;
            }
        });
    }


    @Override
    public int getItemCount() {
        return foodData.size();
    }



    public class myViewHolder extends RecyclerView.ViewHolder  {

        ImageView foodPhotoImageResID;
        TextView foodName, foodCountry;
        CardView foodRootCard;

        public myViewHolder(View itemView) {
            super(itemView);
            foodPhotoImageResID = itemView.findViewById(R.id.details_food_image);
            foodName = itemView.findViewById(R.id.details_food_name);
            foodCountry = itemView.findViewById(R.id.details_food_description);
            foodRootCard = itemView.findViewById(R.id.cv);


        }


    }
}
