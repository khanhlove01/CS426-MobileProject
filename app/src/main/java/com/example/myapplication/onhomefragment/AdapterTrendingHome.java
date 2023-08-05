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

public class AdapterTrendingHome extends RecyclerView.Adapter<AdapterTrendingHome.NFTTrendingHomeViewHolder>{

    private Context context;
    private List<NFTHome> mList;

    public AdapterTrendingHome(Context context, List<NFTHome> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public NFTTrendingHomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_nft_home,parent,false);
        return new NFTTrendingHomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NFTTrendingHomeViewHolder holder, int position) {
        NFTHome nftHome = AppController.nftHomeTrendingList.get(position);

        if(nftHome == null) return;

        holder.imageView_nft.setImageResource(nftHome.getNft_home());
        holder.textView_nft.setText(nftHome.getNft_name());
    }

    @Override
    public int getItemCount() {
        return AppController.nftHomeTrendingList.size();
    }

    public class NFTTrendingHomeViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView imageView_nft;
        private TextView textView_nft;
        public NFTTrendingHomeViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView_nft = itemView.findViewById(R.id.nft_homefragment);
            textView_nft = itemView.findViewById(R.id.tv_nft_home_fragment);
        }
    }
}
