package com.example.myapplication.onstatfragment;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.onsearchfragment.AdapterNFTSearch;

import java.util.List;

public class AdapterRankings extends RecyclerView.Adapter<AdapterRankings.RankingsViewHolder>{

    private Context context;
    private List<NFTRankingInfo> list;

    public AdapterRankings(Context context, List<NFTRankingInfo> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RankingsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_nft_rankings,parent,false);
        return new RankingsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RankingsViewHolder holder, int position) {
        NFTRankingInfo nftRankingInfo = list.get(position);
        if(nftRankingInfo == null) return;

        holder.textViewPosition.setText(nftRankingInfo.getNFTRankingPosition());
        holder.imageViewNFTRanking.setImageResource(nftRankingInfo.getNFTRankingImage());
        holder.textViewName.setText(nftRankingInfo.getNFTRankingName());
        holder.textView24hChange.setText(nftRankingInfo.getNFTRanking24hChange());
        holder.textViewFloorPrice.setText(nftRankingInfo.getNFTRankingFloorPrice());
    }

    @Override
    public int getItemCount() {
        if(list == null) return 0;
        return list.size();
    }

    public class RankingsViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewNFTRanking;
        private TextView textViewPosition, textViewName,textView24hChange,textViewFloorPrice;
        public RankingsViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewPosition = itemView.findViewById(R.id.nft_rankings_sothutu);
            imageViewNFTRanking = itemView.findViewById(R.id.nft_rankings_image);
            textViewName = itemView.findViewById(R.id.nft_rankings_namenft);
            textView24hChange = itemView.findViewById(R.id.nft_rankings_24h_change);
            textViewFloorPrice = itemView.findViewById(R.id.nft_rankings_floor_price);
        }
    }
}
