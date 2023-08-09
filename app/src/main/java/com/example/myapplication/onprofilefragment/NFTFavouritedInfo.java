package com.example.myapplication.onprofilefragment;

public class NFTFavouritedInfo {

    private int NFT_favourite_image;
    private String NFT_favourite_name_above;
    private String NFT_favourite_name_below;

    public NFTFavouritedInfo(int NFT_favourite_image, String NFT_favourite_name_above, String NFT_favourite_name_below) {
        this.NFT_favourite_image = NFT_favourite_image;
        this.NFT_favourite_name_above = NFT_favourite_name_above;
        this.NFT_favourite_name_below = NFT_favourite_name_below;
    }

    public int getNFT_favourite_image() {
        return NFT_favourite_image;
    }

    public void setNFT_favourite_image(int NFT_favourite_image) {
        this.NFT_favourite_image = NFT_favourite_image;
    }

    public String getNFT_favourite_name_above() {
        return NFT_favourite_name_above;
    }

    public void setNFT_favourite_name_above(String NFT_favourite_name_above) {
        this.NFT_favourite_name_above = NFT_favourite_name_above;
    }

    public String getNFT_favourite_name_below() {
        return NFT_favourite_name_below;
    }

    public void setNFT_favourite_name_below(String NFT_favourite_name_below) {
        this.NFT_favourite_name_below = NFT_favourite_name_below;
    }
}
