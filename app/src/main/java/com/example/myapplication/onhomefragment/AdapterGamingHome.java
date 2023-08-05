package com.example.myapplication.onhomefragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.AppController;
import com.example.myapplication.R;

import java.util.List;

public class AdapterGamingHome extends RecyclerView.Adapter<AdapterGamingHome.NFTGamingHomeViewHolder>{

    private Context context;
    private List<NFTHome> mList;

    public AdapterGamingHome(Context context, List<NFTHome> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public NFTGamingHomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_nft_home,parent,false);
        return new NFTGamingHomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NFTGamingHomeViewHolder holder, int position) {
        NFTHome nftHome = AppController.nftHomeGamingList.get(position);
        if(nftHome == null) return;

        holder.imageView_nft.setImageResource(nftHome.getNft_home());
        holder.textView_nft.setText(nftHome.getNft_name());
    }

    @Override
    public int getItemCount() {
        return AppController.nftHomeGamingList.size();
    }

    public class NFTGamingHomeViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView_nft;
        private TextView textView_nft;
        public NFTGamingHomeViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView_nft = itemView.findViewById(R.id.nft_homefragment);
            textView_nft = itemView.findViewById(R.id.tv_nft_home_fragment);
        }
    }
}
