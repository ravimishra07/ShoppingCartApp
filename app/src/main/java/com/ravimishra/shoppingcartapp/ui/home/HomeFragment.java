package com.ravimishra.shoppingcartapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ravimishra.shoppingcartapp.CategoryAdapter;
import com.ravimishra.shoppingcartapp.MainActivity;
import com.ravimishra.shoppingcartapp.MainCategoryModel;
import com.ravimishra.shoppingcartapp.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

   // MainActivity context;
//    MainCategoryModel viewModel;
    RecyclerView recyclerView;
    CategoryAdapter recyclerViewAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final RecyclerView main_rv = root.findViewById(R.id.rv_main_category);
        homeViewModel = ViewModelProviders.of(getActivity()).get(HomeViewModel.class);
        //viewModel.g().observe(context, userListUpdateObserver);
        homeViewModel.getUserMutableLiveData().observe(getActivity(), userListUpdateObserver);

        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }


    Observer<ArrayList<MainCategoryModel>> userListUpdateObserver = new Observer<ArrayList<MainCategoryModel>>() {
        @Override
        public void onChanged(ArrayList<MainCategoryModel> userArrayList) {
            recyclerViewAdapter = new CategoryAdapter(getActivity(),userArrayList);

            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setAdapter(recyclerViewAdapter);
        }


    };

}