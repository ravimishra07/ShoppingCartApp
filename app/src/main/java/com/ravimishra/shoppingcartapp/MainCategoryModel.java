package com.ravimishra.shoppingcartapp;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

public class MainCategoryModel {
    private String categoryName;
    private String imageName;

    public MainCategoryModel(String categoryName, String imageName) {
        this.categoryName = categoryName;
        this.imageName = imageName;
    }

    public MainCategoryModel() {

    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

}
