package com.example.lenovo.foodlist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    Context nContext;
    List<item> nData;
    item item2;

;
    public Adapter(Context nContext, List<item> nData ) {
        this.nContext = nContext;
        this.nData = nData;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(nContext);
        View v = inflater.inflate(R.layout.card_item, parent, false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final myViewHolder holder, int position) {
        holder.food_photo.setImageResource(nData.get(position).getFoodPhoto());
        holder.tv_name.setText(nData.get(position).getFoodName());
        holder.tv_c.setText(nData.get(position).getcName());
        item2 = nData.get(position);
        holder.c_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nContext,InsideActivity2.class);
                intent.putExtra("descrip",item2.getDescription());
                intent.putExtra("cname",item2.getcName());
                intent.putExtra("foodname",item2.getFoodName());
                intent.putExtra("foodphoto",item2.getFoodPhoto());
                nContext.startActivity(intent);
            }

        });
//        holder.c_v.setOnLongClickListener(new View.OnLongClickListener() {
//
//            CardView cv_v;
//            @Override
//            public boolean onLongClick(View v) {
//                nData.remove();
//                return false;
//            }
//        });

    }
    @Override
    public int getItemCount() {
        return nData.size();
    }



    public class myViewHolder extends RecyclerView.ViewHolder  {

        ImageView food_photo;
        TextView tv_name, tv_c;
        CardView c_v;

        public myViewHolder(View itemView) {
            super(itemView);
            food_photo = itemView.findViewById(R.id.food_photo);
            tv_name = itemView.findViewById(R.id.food_name);
            tv_c = itemView.findViewById(R.id.food_c);
            c_v = itemView.findViewById(R.id.cv);


        }

    }
}
