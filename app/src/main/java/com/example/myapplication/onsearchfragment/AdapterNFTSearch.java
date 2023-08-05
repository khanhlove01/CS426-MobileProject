package com.example.myapplication.onsearchfragment;

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
import com.example.myapplication.onhomefragment.AdapterArtHome;
import com.example.myapplication.onhomefragment.NFTHome;

import java.util.List;

public class AdapterNFTSearch extends RecyclerView.Adapter<AdapterNFTSearch.NFTSearchViewHolder>{

    private Context context;
    private List<NFTHome> list;

    public AdapterNFTSearch(Context context, List<NFTHome> list) {
        this.context = context;
        this.list = list;
    }

    public void setFilteredList(List<NFTHome>filteredListlist)
    {
        this.list = filteredListlist;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public NFTSearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_nft_home,parent,false);
        return new NFTSearchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NFTSearchViewHolder holder, int position) {
        NFTHome nftHome = AppController.nftHomeFullList.get(position);

        if(nftHome == null) return;

        holder.imageView_nft.setImageResource(nftHome.getNft_home());
        holder.textView_nft.setText(nftHome.getNft_name());
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    public class NFTSearchViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView_nft;
        private TextView textView_nft;
        public NFTSearchViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView_nft = itemView.findViewById(R.id.nft_homefragment);
            textView_nft = itemView.findViewById(R.id.tv_nft_home_fragment);
        }
    }
}
