package NesneYonelimliaATM;

import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        Scanner sc = new Scanner(System.in);
        String kullanici_adi;
        String parola;
        System.out.print("Kullanıcı adı: ");
        kullanici_adi = sc.nextLine();
        System.out.print("Şifre: ");
        parola = sc.nextLine();

        if(hesap.getKullaniciAdi().equals(kullanici_adi) && hesap.getSifre().equals(parola)){
            return true;
        }
        else{ return false;}

    }
}
