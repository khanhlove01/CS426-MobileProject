package com.example.myapplication.onstatfragment;

public class NFTRankingInfo {
    private String NFTRankingPosition;
    private int NFTRankingImage;
    private String NFTRankingName;
    private String NFTRanking24hChange;
    private String NFTRankingFloorPrice;

    public NFTRankingInfo(String NFTRankingPosition, int NFTRankingImage, String NFTRankingName, String NFTRanking24hChange, String NFTRankingFloorPrice) {
        this.NFTRankingPosition = NFTRankingPosition;
        this.NFTRankingImage = NFTRankingImage;
        this.NFTRankingName = NFTRankingName;
        this.NFTRanking24hChange = NFTRanking24hChange;
        this.NFTRankingFloorPrice = NFTRankingFloorPrice;
    }

    public String getNFTRankingPosition() {
        return NFTRankingPosition;
    }

    public void setNFTRankingPosition(String NFTRankingPosition) {
        this.NFTRankingPosition = NFTRankingPosition;
    }

    public int getNFTRankingImage() {
        return NFTRankingImage;
    }

    public void setNFTRankingImage(int NFTRankingImage) {
        this.NFTRankingImage = NFTRankingImage;
    }

    public String getNFTRankingName() {
        return NFTRankingName;
    }

    public void setNFTRankingName(String NFTRankingName) {
        this.NFTRankingName = NFTRankingName;
    }

    public String getNFTRanking24hChange() {
        return NFTRanking24hChange;
    }

    public void setNFTRanking24hChange(String NFTRanking24hChange) {
        this.NFTRanking24hChange = NFTRanking24hChange;
    }

    public String getNFTRankingFloorPrice() {
        return NFTRankingFloorPrice;
    }

    public void setNFTRankingFloorPrice(String NFTRankingFloorPrice) {
        this.NFTRankingFloorPrice = NFTRankingFloorPrice;
    }
}
