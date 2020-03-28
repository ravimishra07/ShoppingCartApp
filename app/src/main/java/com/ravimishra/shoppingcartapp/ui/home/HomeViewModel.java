package com.ravimishra.shoppingcartapp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ravimishra.shoppingcartapp.MainCategoryModel;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    MutableLiveData<ArrayList<MainCategoryModel>> userLiveData;
    ArrayList<MainCategoryModel> userArrayList;

    public HomeViewModel() {
        userLiveData = new MutableLiveData<>();
        init();
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public HomeViewModel(MutableLiveData<String> mText, MutableLiveData<ArrayList<MainCategoryModel>> userLiveData, ArrayList<MainCategoryModel> userArrayList) {
        this.mText = mText;
        this.userLiveData = userLiveData;
        this.userArrayList = userArrayList;
    }

    public LiveData<String> getText() {
        return mText;
    }


    public void init() {
        populateList();
        userLiveData.setValue(userArrayList);
    }

    public MutableLiveData<ArrayList<MainCategoryModel>> getUserMutableLiveData() {
        return userLiveData;
    }

    public void populateList() {
        /// furniture
        MainCategoryModel cat1 = new MainCategoryModel();
        cat1.setCategoryName("Furniture");
        cat1.setImageName("furnitureIMg");

        // gym
        MainCategoryModel cat2 = new MainCategoryModel();
        cat2.setCategoryName("Gym Equipments");
        cat2.setImageName("gymImg");

        // cloths
        MainCategoryModel cat3 = new MainCategoryModel();
        cat3.setCategoryName("Cloths");
        cat3.setImageName("clothImg");

        // electronics
        MainCategoryModel cat4 = new MainCategoryModel();
        cat4.setCategoryName("Cloths");
        cat4.setImageName("clothImg");

        //home appliances
        MainCategoryModel cat5 = new MainCategoryModel();
        cat5.setCategoryName("Home appliances");
        cat5.setImageName("homeApplImg");


        userArrayList = new ArrayList<>();
        userArrayList.add(cat1);
        userArrayList.add(cat2);
        userArrayList.add(cat3);
        userArrayList.add(cat4);
        userArrayList.add(cat5);
//      userArrayList.add(user);
    }
}