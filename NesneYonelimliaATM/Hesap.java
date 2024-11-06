package NesneYonelimliaATM;

public class Hesap {

    private String kullaniciAdi;
    private String sifre;
    private double bakiye;



    public void paraYatir(double tutar){
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz: "+bakiye);
    }

    public void paraCek(double tutar){
        if(tutar > bakiye){
            System.out.println("Yetersiz bakiye !");
        }
        else{
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz: "+ bakiye);
        }
    }



    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public Hesap(String kullaniciAdi, String sifre, double bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.bakiye = bakiye;
    }
}
