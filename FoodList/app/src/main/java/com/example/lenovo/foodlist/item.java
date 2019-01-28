package com.example.lenovo.foodlist;

import android.util.EventLogTags;

public class item {

    String foodName;
    int foodPhoto;
    String cName;
    String Description;


    public item(String foodName, int foodPhoto, String cName, String Description) {
        this.foodName = foodName;
        this.foodPhoto = foodPhoto;
        this.cName = cName;
        this.Description = Description;
    }


    public String getFoodName() {
        return foodName;
    }

    public int getFoodPhoto() {
        return foodPhoto;
    }

    public String getcName() {
        return cName;
    }

    public  String getDescription() {
        return Description;
    }


    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodPhoto(int foodPhoto) {
        this.foodPhoto = foodPhoto;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setDescription(String description) {
        this.Description = description;
    }
}
