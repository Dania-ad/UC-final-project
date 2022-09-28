package com.example.project;

import java.io.Serializable;

public class Places implements Serializable {
    private String placeName;
    private int placePic;
    private int placeIntro;
    private String placeLoc;
    private double latitude;
    private double longtude;

    public Places(String placeName, int placePic, int placeIntro, String placeLoc, double latitude, double longtude) {
        this.placeName = placeName;
        this.placePic = placePic;
        this.placeIntro = placeIntro;
        this.placeLoc = placeLoc;
        this.latitude = latitude;
        this.longtude = longtude;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getPlacePic() {
        return placePic;
    }

    public void setPlacePic(int placePic) {
        this.placePic = placePic;
    }

    public int getPlaceIntro() {
        return placeIntro;
    }

    public void setPlaceIntro(int placeIntro) {
        this.placeIntro = placeIntro;
    }

    public String getPlaceLoc() {
        return placeLoc;
    }

    public void setPlaceLoc(String placeLoc) {
        this.placeLoc = placeLoc;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongtude() {
        return longtude;
    }

    public void setLongtude(double longtude) {
        this.longtude = longtude;
    }
}

