package com.example.myapplication.onstatfragment;

public class NFTActivityInfo {
    private int NFTActivityImage;
    private String NFTActivityAboveName;
    private String NFTActivityName;
    private String NFTPrice;
    private String NFTFromPerson;
    private String NFTToPerson;

    public NFTActivityInfo(int NFTActivityImage, String NFTActivityAboveName, String NFTActivityName, String NFTPrice, String NFTFromPerson, String NFTToPerson) {
        this.NFTActivityImage = NFTActivityImage;
        this.NFTActivityAboveName = NFTActivityAboveName;
        this.NFTActivityName = NFTActivityName;
        this.NFTPrice = NFTPrice;
        this.NFTFromPerson = NFTFromPerson;
        this.NFTToPerson = NFTToPerson;
    }

    public int getNFTActivityImage() {
        return NFTActivityImage;
    }

    public void setNFTActivityImage(int NFTActivityImage) {
        this.NFTActivityImage = NFTActivityImage;
    }

    public String getNFTActivityAboveName() {
        return NFTActivityAboveName;
    }

    public void setNFTActivityAboveName(String NFTActivityAboveName) {
        this.NFTActivityAboveName = NFTActivityAboveName;
    }

    public String getNFTActivityName() {
        return NFTActivityName;
    }

    public void setNFTActivityName(String NFTActivityName) {
        this.NFTActivityName = NFTActivityName;
    }

    public String getNFTPrice() {
        return NFTPrice;
    }

    public void setNFTPrice(String NFTPrice) {
        this.NFTPrice = NFTPrice;
    }

    public String getNFTFromPerson() {
        return NFTFromPerson;
    }

    public void setNFTFromPerson(String NFTFromPerson) {
        this.NFTFromPerson = NFTFromPerson;
    }

    public String getNFTToPerson() {
        return NFTToPerson;
    }

    public void setNFTToPerson(String NFTToPerson) {
        this.NFTToPerson = NFTToPerson;
    }
}
