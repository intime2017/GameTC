package com.example.paul.gametc;

/**
 * Created by Paul on 12/16/2017.
 */

public class recv
{
    String Tlatitude,Tlongitude,key;

    public recv( String lat, String lon) {
        this.Tlatitude = lat;
        this.Tlongitude = lon;
    }

    public String getTlatitude() {
        return Tlatitude;
    }

    public String getTlongitude() {
        return Tlongitude;
    }

    public void setTlatitude(String tlatitude) {
        Tlatitude = tlatitude;
    }

    public void setTlongitude(String tlongitude) {
        Tlongitude = tlongitude;
    }
}
