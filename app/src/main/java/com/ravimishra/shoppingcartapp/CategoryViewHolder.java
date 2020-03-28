package com.ravimishra.shoppingcartapp;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract  class CategoryViewHolder extends RecyclerView.ViewHolder {

    public CategoryViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    private int mCurrentPosition;
    protected abstract void clear();
    public void onBind(int position) {
        mCurrentPosition = position;
        clear();
    }
    public int getCurrentPosition() {
        return mCurrentPosition;
    }
}
