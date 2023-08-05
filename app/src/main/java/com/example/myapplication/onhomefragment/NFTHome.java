package com.example.myapplication.onhomefragment;

public class NFTHome {
    private int nft_home;
    private String nft_name;

    public NFTHome(int nft_home, String nft_name) {
        this.nft_home = nft_home;
        this.nft_name = nft_name;
    }

    public int getNft_home() {
        return nft_home;
    }

    public void setNft_home(int nft_home) {
        this.nft_home = nft_home;
    }

    public String getNft_name() {
        return nft_name;
    }

    public void setNft_name(String nft_name) {
        this.nft_name = nft_name;
    }
}
