package com.ravimishra.shoppingcartapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.ravimishra.shoppingcartapp.ui.home.HomeViewModel;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        Activity context;
        ArrayList<MainCategoryModel> userArrayList;

        public CategoryAdapter(Activity context, ArrayList<MainCategoryModel> userArrayList) {
            this.context = context;
            this.userArrayList = userArrayList;
        }


        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View rootView = LayoutInflater.from(context).inflate(R.layout.main_category_row,parent,false);
            return new RecyclerViewViewHolder(rootView);
        }

        @Override
        // similar to cell for row
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

            MainCategoryModel catModel = userArrayList.get(position);
            RecyclerViewViewHolder viewHolder= (RecyclerViewViewHolder) holder;

            viewHolder.txtView_title.setText(catModel.getCategoryName());

            viewHolder.imgView_icon.setImageResource(R.drawable.ic_gym);
        }

        @Override
        public int getItemCount() {
            return userArrayList.size();
        }

        class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
            ImageView imgView_icon;
            TextView txtView_title;

            public RecyclerViewViewHolder(@NonNull View itemView) {
                super(itemView);
                imgView_icon = itemView.findViewById(R.id.cat_img_id);
                txtView_title = itemView.findViewById(R.id.cat_text_id);


            }
        }
    }