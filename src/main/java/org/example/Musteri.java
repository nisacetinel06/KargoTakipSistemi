package org.example;

import java.lang.ref.PhantomReference;

public class Musteri {
    private String ad;
    private String adres;

    public Musteri(String ad,String adres){
        this.ad=ad;
        this.adres=adres;
    }
    public String getAd(){
        return ad;
    }
    public String getAdres(){
        return adres;
    }
}
