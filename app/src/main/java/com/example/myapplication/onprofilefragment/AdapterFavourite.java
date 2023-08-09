package com.example.myapplication.onprofilefragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class AdapterFavourite extends RecyclerView.Adapter<AdapterFavourite.FavouriteViewHolder>{

    private Context mContext;
    private List<NFTFavouritedInfo> list;

    public AdapterFavourite(Context mContext, List<NFTFavouritedInfo> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @NonNull
    @Override
    public FavouriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_nft_favourited,parent,false);
        return new FavouriteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavouriteViewHolder holder, int position) {
        NFTFavouritedInfo nftFavouritedInfo = list.get(position);

        if(nftFavouritedInfo == null) return;

        holder.imageViewNFTFavourite.setImageResource(nftFavouritedInfo.getNFT_favourite_image());
        holder.textViewNFTFavouriteBelow.setText(nftFavouritedInfo.getNFT_favourite_name_below());
        holder.textViewNFTFavouriteAbove.setText(nftFavouritedInfo.getNFT_favourite_name_above());
    }

    @Override
    public int getItemCount() {
        if(list == null) return 0;
        return list.size();
    }

    public class FavouriteViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewNFTFavourite;
        private TextView textViewNFTFavouriteAbove;
        private TextView textViewNFTFavouriteBelow;
        public FavouriteViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewNFTFavourite = itemView.findViewById(R.id.image_nft_favourite);
            textViewNFTFavouriteAbove = itemView.findViewById(R.id.name_nft_favourite_above);
            textViewNFTFavouriteBelow = itemView.findViewById(R.id.name_nft_favourite_below);
        }
    }
}
