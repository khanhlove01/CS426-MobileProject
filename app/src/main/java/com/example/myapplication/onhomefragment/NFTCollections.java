package com.example.myapplication.onhomefragment;

public class NFTCollections {
    private int nft_Collections;
    private String nft_CollectionName;
    private String nft_CollectionBelowName;

    public NFTCollections(int nft_Collections, String nft_CollectionName, String nft_CollectionBelowName) {
        this.nft_Collections = nft_Collections;
        this.nft_CollectionName = nft_CollectionName;
        this.nft_CollectionBelowName = nft_CollectionBelowName;
    }

    public int getNft_Collections() {
        return nft_Collections;
    }

    public void setNft_Collections(int nft_Collections) {
        this.nft_Collections = nft_Collections;
    }

    public String getNft_CollectionName() {
        return nft_CollectionName;
    }

    public void setNft_CollectionName(String nft_CollectionName) {
        this.nft_CollectionName = nft_CollectionName;
    }

    public String getNft_CollectionBelowName() {
        return nft_CollectionBelowName;
    }

    public void setNft_CollectionBelowName(String nft_CollectionBelowName) {
        this.nft_CollectionBelowName = nft_CollectionBelowName;
    }
}
