package org.example;

public class Kargo {
    private int takipNo;
    private Musteri gonderici;
    private Musteri alici;
    private Sube sube;
    private TeslimatGorevlisi gorevli;
    private KargoDurumu durum;

    public Kargo(int takipNo,Musteri gonderici, Musteri alici, Sube sube, TeslimatGorevlisi gorevli){
        this.takipNo=takipNo;
        this.gonderici=gonderici;
        this.alici=alici;
        this.sube=sube;
        this.gorevli=gorevli;
        this.durum=KargoDurumu.YOLDA; //default YOLDA
    }

    public void durumGuncelle(KargoDurumu yeniDurum){
        this.durum=yeniDurum;
        System.out.println("Kargo "+takipNo+" durumu güncellendi: "+yeniDurum);
    }

    public void kargoBilgileriniGoster(){
        System.out.println("\nKargo Takip Numarası: "+takipNo);
        System.out.println("Gönderen: "+gonderici.getAd()+" Adres: "+ gonderici.getAdres());
        System.out.println("Alıcı: "+alici.getAd()+" Adres: "+ alici.getAdres());
        System.out.println("Şube: "+sube.getSubeAdi());
        System.out.println("Teslimat Görevlisi: "+gorevli.getGorevliAdi());
        System.out.println("Kargo durumu: "+durum);
    }
}
