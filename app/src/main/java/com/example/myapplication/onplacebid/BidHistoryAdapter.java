package com.example.myapplication.onplacebid;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.onprofilefragment.AdapterOfferMade;

import java.util.List;

public class BidHistoryAdapter extends RecyclerView.Adapter<BidHistoryAdapter.BidHistoryViewHolder>{

    private Context context;
    private List<NFTBidHistoryInfo> list;

    public BidHistoryAdapter(Context context, List<NFTBidHistoryInfo> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public BidHistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_nft_bid_history,parent,false);
        return new BidHistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BidHistoryViewHolder holder, int position) {
        NFTBidHistoryInfo nftBidHistoryInfo = list.get(position);

        if(nftBidHistoryInfo == null) return;

        holder.imageViewNFTBidHistory.setImageResource(nftBidHistoryInfo.getNFTBidHistoryImage());
        holder.textViewNFTBidHistoryName.setText(nftBidHistoryInfo.getNFTBidHistoryName());
        holder.textViewNFTBidHistoryETHPrice.setText(nftBidHistoryInfo.getNFTBidHistoryETHPrice());
        holder.textViewNFTBidHistoryTimeAgo.setText(nftBidHistoryInfo.getNFTBidHistoryTimeAgo());
        holder.textViewNFTBidHistoryUSDPrice.setText(nftBidHistoryInfo.getNFTBidHistoryUSDPrice());
        holder.textViewNFTBidHistoryFloorDiff.setText(nftBidHistoryInfo.getNFTBidHistoryFloorDiff());
        holder.textViewNFTBidHistoryExpiration.setText(nftBidHistoryInfo.getNFTBidHistoryExpiration());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(holder.itemView.getContext());
                builder.setTitle("Are you sure about that?")
                        .setMessage("Delete this bid!!!")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //Controller.total_reward-=500;
                                //System.out.println(Controller.total_reward);
                                list.remove(position);
                                notifyDataSetChanged();
                                Toast.makeText(holder.itemView.getContext(),"Deleted",Toast.LENGTH_SHORT).show();

                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                builder.setCancelable(true);
                            }
                        }).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        if(list == null) return 0;
        return list.size();
    }

    public class BidHistoryViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewNFTBidHistory;
        private TextView textViewNFTBidHistoryName;
        private TextView textViewNFTBidHistoryETHPrice;
        private TextView textViewNFTBidHistoryTimeAgo;
        private TextView textViewNFTBidHistoryUSDPrice;
        private TextView textViewNFTBidHistoryFloorDiff;
        private TextView textViewNFTBidHistoryExpiration;

        public BidHistoryViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewNFTBidHistory = itemView.findViewById(R.id.nft_image_bid_history);
            textViewNFTBidHistoryName = itemView.findViewById(R.id.nft_name_bid_history);
            textViewNFTBidHistoryETHPrice = itemView.findViewById(R.id.nft_bid_history_eth_price);
            textViewNFTBidHistoryTimeAgo = itemView.findViewById(R.id.nft_bid_history_time_ago);
            textViewNFTBidHistoryUSDPrice = itemView.findViewById(R.id.nft_bid_history_usd_price);
            textViewNFTBidHistoryFloorDiff = itemView.findViewById(R.id.nft_bid_history_floor_diff);
            textViewNFTBidHistoryExpiration = itemView.findViewById(R.id.nft_bid_history_expiration);
        }
    }
}
