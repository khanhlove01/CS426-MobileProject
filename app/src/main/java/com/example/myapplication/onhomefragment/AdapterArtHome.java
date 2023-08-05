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

public class AdapterArtHome extends RecyclerView.Adapter<AdapterArtHome.NFTArtHomeViewHolder>{

    private Context context;
    private List<NFTHome> mList;

    public AdapterArtHome(Context context, List<NFTHome> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public NFTArtHomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_nft_home,parent,false);
        return new NFTArtHomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NFTArtHomeViewHolder holder, int position) {
        NFTHome nftHome = AppController.nftHomeArtList.get(position);

        if(nftHome == null) return;

        holder.imageView_nft.setImageResource(nftHome.getNft_home());
        holder.textView_nft.setText(nftHome.getNft_name());
    }

    @Override
    public int getItemCount() {
        return AppController.nftHomeArtList.size();
    }

    public class NFTArtHomeViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView_nft;
        private TextView textView_nft;
        public NFTArtHomeViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView_nft = itemView.findViewById(R.id.nft_homefragment);
            textView_nft = itemView.findViewById(R.id.tv_nft_home_fragment);
        }
    }
}
