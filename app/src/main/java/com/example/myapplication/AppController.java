package com.example.myapplication;

import com.example.myapplication.onhomefragment.NFTHome;

import java.util.ArrayList;
import java.util.List;

public class AppController {

    public static List<NFTHome> nftHomeTrendingList = new ArrayList<>();
    public static List<NFTHome> nftHomeArtList = new ArrayList<>();

    public static List<NFTHome> nftHomeGamingList = new ArrayList<>();
    public static List<NFTHome> nftHomeFullList = new ArrayList<>();

    public static void addNFTTrending()
    {
        nftHomeTrendingList.add(new NFTHome(R.drawable.cyball_home1,"Cybloc#99999"));
        nftHomeTrendingList.add(new NFTHome(R.drawable.cyball_home2,"Cybloc#99999"));
        nftHomeTrendingList.add(new NFTHome(R.drawable.cyball_home3,"Cybloc#99999"));
        nftHomeTrendingList.add(new NFTHome(R.drawable.cyball_home4,"Cybloc#99999"));
    }

    public static  void  addNFTArt()
    {
        nftHomeArtList.add(new NFTHome(R.drawable.art_home1,"SeasonArt#121"));
        nftHomeArtList.add(new NFTHome(R.drawable.art_home2,"SeasonArt#121"));
        nftHomeArtList.add(new NFTHome(R.drawable.art_home3,"SeasonArt#121"));
        nftHomeArtList.add(new NFTHome(R.drawable.art_home4,"SeasonArt#121"));
    }

    public static  void addNFTGaming()
    {
        nftHomeGamingList.add(new NFTHome(R.drawable.avatar_home1,"Avatar#9054"));
        nftHomeGamingList.add(new NFTHome(R.drawable.avatar_home2,"Avatar#9054"));
        nftHomeGamingList.add(new NFTHome(R.drawable.avatar_home3,"Avatar#9054"));
        nftHomeGamingList.add(new NFTHome(R.drawable.avatar_home4,"Avatar#9054"));

        nftHomeGamingList.add(new NFTHome(R.drawable.trending_home1,"BearNFT#545"));
        nftHomeGamingList.add(new NFTHome(R.drawable.trending_home2,"BearNFT#545"));
        nftHomeGamingList.add(new NFTHome(R.drawable.trending_home3,"BearNFT#545"));
        nftHomeGamingList.add(new NFTHome(R.drawable.trending_home4,"BearNFT#545"));
    }

    public static void addNFTFullList()
    {
        nftHomeFullList.addAll(nftHomeArtList);
        nftHomeFullList.addAll(nftHomeTrendingList);
        nftHomeFullList.addAll(nftHomeGamingList);
    }
}
