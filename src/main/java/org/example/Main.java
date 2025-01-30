package org.example;

public class Main {
    public static void main(String[] args) {

        Musteri gonderici = new Musteri("Nisa Çetinel","HATAY/Payas");
        Musteri alici= new Musteri("Yağız Çetinel","OSMANİYE/Bahçe");
        Sube sube=new Sube("Bahçe Sube");
        TeslimatGorevlisi gorevli= new TeslimatGorevlisi("Göktuğ Altay");

        Kargo kargo=new Kargo(1001,gonderici,alici,sube,gorevli);
        kargo.kargoBilgileriniGoster();




    }
}