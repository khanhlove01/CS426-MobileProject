package com.example.myapplication.onplacebid;

public class NFTBidHistoryInfo {
    private int NFTBidHistoryImage;
    private String NFTBidHistoryName;
    private String NFTBidHistoryETHPrice;
    private String NFTBidHistoryTimeAgo;
    private String NFTBidHistoryUSDPrice;
    private String NFTBidHistoryFloorDiff;
    private String NFTBidHistoryExpiration;

    public NFTBidHistoryInfo(int NFTBidHistoryImage, String NFTBidHistoryName, String NFTBidHistoryETHPrice, String NFTBidHistoryTimeAgo, String NFTBidHistoryUSDPrice, String NFTBidHistoryFloorDiff, String NFTBidHistoryExpiration) {
        this.NFTBidHistoryImage = NFTBidHistoryImage;
        this.NFTBidHistoryName = NFTBidHistoryName;
        this.NFTBidHistoryETHPrice = NFTBidHistoryETHPrice;
        this.NFTBidHistoryTimeAgo = NFTBidHistoryTimeAgo;
        this.NFTBidHistoryUSDPrice = NFTBidHistoryUSDPrice;
        this.NFTBidHistoryFloorDiff = NFTBidHistoryFloorDiff;
        this.NFTBidHistoryExpiration = NFTBidHistoryExpiration;
    }

    public int getNFTBidHistoryImage() {
        return NFTBidHistoryImage;
    }

    public void setNFTBidHistoryImage(int NFTBidHistoryImage) {
        this.NFTBidHistoryImage = NFTBidHistoryImage;
    }

    public String getNFTBidHistoryName() {
        return NFTBidHistoryName;
    }

    public void setNFTBidHistoryName(String NFTBidHistoryName) {
        this.NFTBidHistoryName = NFTBidHistoryName;
    }

    public String getNFTBidHistoryETHPrice() {
        return NFTBidHistoryETHPrice;
    }

    public void setNFTBidHistoryETHPrice(String NFTBidHistoryETHPrice) {
        this.NFTBidHistoryETHPrice = NFTBidHistoryETHPrice;
    }

    public String getNFTBidHistoryTimeAgo() {
        return NFTBidHistoryTimeAgo;
    }

    public void setNFTBidHistoryTimeAgo(String NFTBidHistoryTimeAgo) {
        this.NFTBidHistoryTimeAgo = NFTBidHistoryTimeAgo;
    }

    public String getNFTBidHistoryUSDPrice() {
        return NFTBidHistoryUSDPrice;
    }

    public void setNFTBidHistoryUSDPrice(String NFTBidHistoryUSDPrice) {
        this.NFTBidHistoryUSDPrice = NFTBidHistoryUSDPrice;
    }

    public String getNFTBidHistoryFloorDiff() {
        return NFTBidHistoryFloorDiff;
    }

    public void setNFTBidHistoryFloorDiff(String NFTBidHistoryFloorDiff) {
        this.NFTBidHistoryFloorDiff = NFTBidHistoryFloorDiff;
    }

    public String getNFTBidHistoryExpiration() {
        return NFTBidHistoryExpiration;
    }

    public void setNFTBidHistoryExpiration(String NFTBidHistoryExpiration) {
        this.NFTBidHistoryExpiration = NFTBidHistoryExpiration;
    }
}
