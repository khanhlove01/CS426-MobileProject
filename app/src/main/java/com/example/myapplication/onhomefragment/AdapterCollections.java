package com.example.myapplication.onhomefragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterCollections extends RecyclerView.Adapter<AdapterCollections.CollectionsViewHolder>{

    private Context context;
    private List<NFTCollections> mList;

    public AdapterCollections(Context context, List<NFTCollections> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public CollectionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_trending_collection,parent,false);
        return new CollectionsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CollectionsViewHolder holder, int position) {
        NFTCollections nftCollections = mList.get(position);

        if(nftCollections == null) return;

        holder.imageNFTCollections.setImageResource(nftCollections.getNft_Collections());
        holder.textViewNFTName.setText(nftCollections.getNft_CollectionName());
        holder.textViewNFTNameBelow.setText(nftCollections.getNft_CollectionBelowName());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class CollectionsViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageNFTCollections;
        private TextView textViewNFTName;
        private TextView textViewNFTNameBelow;
        public CollectionsViewHolder(@NonNull View itemView) {
            super(itemView);
            imageNFTCollections = itemView.findViewById(R.id.nft_collections);
            textViewNFTName = itemView.findViewById(R.id.nft_collections_name);
            textViewNFTNameBelow = itemView.findViewById(R.id.nft_collections_below_name);
        }
    }
}
