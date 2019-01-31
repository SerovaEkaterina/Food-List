package com.example.lenovo.foodlist.model;

public class Item {

    private String foodName;

    private String countryName;

    private String description;

    private int foodPhoto;

    public Item(String foodName, int foodPhoto, String countryName, String Description) {
        this.foodName = foodName;
        this.foodPhoto = foodPhoto;
        this.countryName = countryName;
        this.description = Description;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getFoodPhoto() {
        return foodPhoto;
    }

    public String getCountryName() {
        return countryName;
    }

    public  String getDescription() {
        return description;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodPhoto(int foodPhoto) {
        this.foodPhoto = foodPhoto;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
