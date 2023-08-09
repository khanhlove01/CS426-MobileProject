package com.example.myapplication.onstatfragment;

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

public class AdapterActivity extends RecyclerView.Adapter<AdapterActivity.ActivityViewHolder>{

    private Context context;
    private List<NFTActivityInfo> list;

    public AdapterActivity(Context context, List<NFTActivityInfo> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ActivityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_nft_activity,parent,false);
        return new ActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActivityViewHolder holder, int position) {
        NFTActivityInfo nftActivityInfo = list.get(position);

        if(nftActivityInfo == null) return;

        holder.imageViewNFTActivity.setImageResource(nftActivityInfo.getNFTActivityImage());
        holder.textViewAboveName.setText(nftActivityInfo.getNFTActivityAboveName());
        holder.textViewName.setText(nftActivityInfo.getNFTActivityName());
        holder.textViewFloorPrice.setText(nftActivityInfo.getNFTPrice());
        holder.textViewFromPerson.setText(nftActivityInfo.getNFTFromPerson());
        holder.textViewToPerson.setText(nftActivityInfo.getNFTToPerson());
    }

    @Override
    public int getItemCount() {
        if(list == null) return 0;
        return list.size();
    }

    public class ActivityViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewNFTActivity;
        private TextView textViewAboveName;
        private TextView textViewName;
        private TextView textViewFloorPrice;
        private TextView textViewFromPerson;
        private TextView textViewToPerson;
        public ActivityViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewNFTActivity = itemView.findViewById(R.id.nft_activity_image);
            textViewAboveName = itemView.findViewById(R.id.nft_activity_above_name);
            textViewName = itemView.findViewById(R.id.nft_activity_name);
            textViewFloorPrice = itemView.findViewById(R.id.nft_activity_usdprice);
            textViewFromPerson = itemView.findViewById(R.id.nft_activity_fromperson);
            textViewToPerson = itemView.findViewById(R.id.nft_rankings_toperson);
        }
    }
}
