package com.example.myapplication.onprofilekarafuru;

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

public class ActivityKaraAdapter extends RecyclerView.Adapter<ActivityKaraAdapter.ActivityKaraViewHolder>{

    private Context context;
    private List<NFTActivityKaraInfo> list;

    public ActivityKaraAdapter(Context context, List<NFTActivityKaraInfo> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ActivityKaraViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_nft_activity,parent,false);
        return new ActivityKaraViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActivityKaraViewHolder holder, int position) {
        NFTActivityKaraInfo nftActivityKaraInfo = list.get(position);

        if(nftActivityKaraInfo == null) return;

        holder.imageViewNFTActivityKara.setImageResource(nftActivityKaraInfo.getNFTActivityKaraImage());
        holder.textViewNFTActivityKaraName.setText(nftActivityKaraInfo.getNFTActivityKaraName());
        holder.textViewNFTActivityKaraAboveName.setText(nftActivityKaraInfo.getNFTActivityKaraAboveName());
        holder.textViewNFTActivityKaraETHPrice.setText(nftActivityKaraInfo.getNFTActivityKaraETHPrice());
        holder.textViewNFTActivityKaraTimeAgo.setText(nftActivityKaraInfo.getNFTActivityKaraTimeAgo());
        holder.textViewNFTActivityUSDPrice.setText(nftActivityKaraInfo.getNFTActivityKaraUSDPrice());
        holder.textViewNFTActivityFromPerson.setText(nftActivityKaraInfo.getNFTActivityKaraFromPerson());
        holder.textViewNFTActivityToPerson.setText(nftActivityKaraInfo.getNFTActivityKaraToPerson());
    }

    @Override
    public int getItemCount() {
        if(list == null) return 0;
        return list.size();
    }

    public class ActivityKaraViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewNFTActivityKara;
        private TextView textViewNFTActivityKaraName;
        private TextView textViewNFTActivityKaraAboveName;
        private TextView textViewNFTActivityKaraETHPrice;
        private TextView textViewNFTActivityKaraTimeAgo;
        private TextView textViewNFTActivityUSDPrice;
        private TextView textViewNFTActivityFromPerson;
        private TextView textViewNFTActivityToPerson;
        public ActivityKaraViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewNFTActivityKara = itemView.findViewById(R.id.nft_activity_image);
            textViewNFTActivityKaraName = itemView.findViewById(R.id.nft_activity_name);
            textViewNFTActivityKaraAboveName = itemView.findViewById(R.id.nft_activity_above_name);
            textViewNFTActivityKaraETHPrice = itemView.findViewById(R.id.nft_activity_ethprice);
            textViewNFTActivityKaraTimeAgo = itemView.findViewById(R.id.nft_activity_timeago);
            textViewNFTActivityUSDPrice = itemView.findViewById(R.id.nft_activity_usdprice);
            textViewNFTActivityFromPerson = itemView.findViewById(R.id.nft_activity_fromperson);
            textViewNFTActivityToPerson = itemView.findViewById(R.id.nft_rankings_toperson);
        }
    }
}
