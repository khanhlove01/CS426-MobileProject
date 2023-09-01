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

public class AdapterOfferMade extends RecyclerView.Adapter<AdapterOfferMade.OfferMadeViewHolder>{

    private Context context;
    private List<NFTOfferMadeInfo> list;

    public AdapterOfferMade(Context context, List<NFTOfferMadeInfo> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public OfferMadeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_nft_offers_made,parent,false);
        return new OfferMadeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OfferMadeViewHolder holder, int position) {
        NFTOfferMadeInfo nftOfferMadeInfo = list.get(position);

        if(nftOfferMadeInfo == null) return;

        /*Glide.with(context)
                .load(nftOfferMadeInfo.getNFT_Offer_Made_ImageUri()) // Use the appropriate method to get the Uri
                .into(holder.imageViewOfferMade);*/

        holder.imageViewOfferMade.setImageResource(nftOfferMadeInfo.getNFT_Offer_Made_Image());
        holder.textViewOfferMadeName.setText(nftOfferMadeInfo.getNFT_Offer_Made_Name());
        holder.textViewOfferMadeETHPrice.setText(nftOfferMadeInfo.getNFT_Offer_Made_ETHPrice());
        holder.textViewOfferMadeTimeAgo.setText(nftOfferMadeInfo.getNFT_Offer_Made_TimeAgo());
        holder.textViewOfferMadeUSDPrice.setText(nftOfferMadeInfo.getNFT_Offer_Made_USDPrice());
        holder.textViewOfferMadeExpiration.setText(nftOfferMadeInfo.getNFT_Offer_Made_Expiration());
    }

    @Override
    public int getItemCount() {
        if(list == null) return 0;
        return list.size();
    }

    public class OfferMadeViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewOfferMade;
        private TextView textViewOfferMadeName;
        private TextView textViewOfferMadeETHPrice;
        private TextView textViewOfferMadeTimeAgo;
        private TextView textViewOfferMadeUSDPrice;
        private TextView textViewOfferMadeExpiration;
        public OfferMadeViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewOfferMade = itemView.findViewById(R.id.nft_offer_made_image);
            textViewOfferMadeName = itemView.findViewById(R.id.nft_offer_made_name);
            textViewOfferMadeETHPrice = itemView.findViewById(R.id.nft_offer_made_ethprice);
            textViewOfferMadeTimeAgo = itemView.findViewById(R.id.nft_offer_made_time_ago);
            textViewOfferMadeUSDPrice = itemView.findViewById(R.id.nft_offer_made_usdprice);
            textViewOfferMadeExpiration = itemView.findViewById(R.id.nft_offer_made_expiration);
        }
    }
}
