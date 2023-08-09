package com.example.myapplication;

import com.example.myapplication.onhomefragment.NFTHome;
import com.example.myapplication.onplacebid.NFTBidHistoryInfo;
import com.example.myapplication.onprofilefragment.NFTOfferMadeInfo;

import java.util.ArrayList;
import java.util.List;

public class AppController {

    public static List<NFTHome> nftHomeTrendingList = new ArrayList<>();
    public static List<NFTHome> nftHomeArtList = new ArrayList<>();

    public static List<NFTHome> nftHomeGamingList = new ArrayList<>();
    public static List<NFTHome> nftHomeFullList = new ArrayList<>();

    public static List<NFTBidHistoryInfo> nftBidHistoryInfoList = new ArrayList<>();

    public static List<NFTOfferMadeInfo> nftOfferMadeInfoList = new ArrayList<>();

    public static void addNFTOfferMade()
    {
        nftOfferMadeInfoList.add(new NFTOfferMadeInfo(R.drawable.activity_image1,"Kakira #1599","0,003",
                "1 months ago","$35,63","3 months"));
        nftOfferMadeInfoList.add(new NFTOfferMadeInfo(R.drawable.activity_image2,"Kakira #1099","0,006",
                "2 months ago","$71,16","2 months"));
        nftOfferMadeInfoList.add(new NFTOfferMadeInfo(R.drawable.activity_image1,"Kakira #1599","0,003",
                "1 months ago","$35,63","3 months"));
    }

    public static void addNFTTrending()
    {
        nftHomeTrendingList.add(new NFTHome(R.drawable.cyball_home1,"Cybloc99999"));
        nftHomeTrendingList.add(new NFTHome(R.drawable.cyball_home2,"Cybloc99999"));
        nftHomeTrendingList.add(new NFTHome(R.drawable.cyball_home3,"Cybloc99999"));
        nftHomeTrendingList.add(new NFTHome(R.drawable.cyball_home4,"Cybloc99999"));
    }

    public static  void  addNFTArt()
    {
        nftHomeArtList.add(new NFTHome(R.drawable.art_home1,"SeasonArt121"));
        nftHomeArtList.add(new NFTHome(R.drawable.art_home2,"SeasonArt121"));
        nftHomeArtList.add(new NFTHome(R.drawable.art_home3,"SeasonArt121"));
        nftHomeArtList.add(new NFTHome(R.drawable.art_home4,"SeasonArt121"));
    }

    public static  void addNFTGaming()
    {
        nftHomeGamingList.add(new NFTHome(R.drawable.avatar_home1,"Avatar9054"));
        nftHomeGamingList.add(new NFTHome(R.drawable.avatar_home2,"Avatar9054"));
        nftHomeGamingList.add(new NFTHome(R.drawable.avatar_home3,"Avatar9054"));
        nftHomeGamingList.add(new NFTHome(R.drawable.avatar_home4,"Avatar9054"));

        nftHomeGamingList.add(new NFTHome(R.drawable.trending_home1,"BearNFT545"));
        nftHomeGamingList.add(new NFTHome(R.drawable.trending_home2,"BearNFT545"));
        nftHomeGamingList.add(new NFTHome(R.drawable.trending_home3,"BearNFT545"));
        nftHomeGamingList.add(new NFTHome(R.drawable.trending_home4,"BearNFT545"));
    }

    public static void addNFTFullList()
    {
        nftHomeFullList.addAll(nftHomeArtList);
        nftHomeFullList.addAll(nftHomeTrendingList);
        nftHomeFullList.addAll(nftHomeGamingList);
    }
}
