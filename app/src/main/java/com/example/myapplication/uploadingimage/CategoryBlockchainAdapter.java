package com.example.myapplication.uploadingimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.R;

import java.util.List;

public class CategoryBlockchainAdapter extends ArrayAdapter<CategoryBlockchain> {
    public CategoryBlockchainAdapter(@NonNull Context context, int resource, @NonNull List<CategoryBlockchain> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.spinner_choose_blockchain,parent,false);
        TextView tvSelected = convertView.findViewById(R.id.textview_selected_choose_blockchain);

        CategoryBlockchain categoryBlockchain = this.getItem(position);
        if(categoryBlockchain != null)
        {
            tvSelected.setText(categoryBlockchain.getName());
        }
        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.spinner_item_category_blockchain,parent,false);
        TextView textViewCategory = convertView.findViewById(R.id.textview_category_blockchain);

        CategoryBlockchain categoryBlockchain = this.getItem(position);
        if(categoryBlockchain != null)
        {
            textViewCategory.setText(categoryBlockchain.getName());
        }
        return convertView;
    }
}
