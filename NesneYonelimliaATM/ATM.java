package NesneYonelimliaATM;

import java.util.Scanner;
public class ATM {
    public void calis(Hesap hesap){

        Login giris = new Login();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hoş geldiniz...");

        System.out.println("*************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*************************");

        int giris_hakki = 3;

        while(true){
            if(giris.login(hesap)){
                System.out.println("Giriş Başarılı.");
                break;


            }
            else{
                System.out.println("Giriş başarısız");
                giris_hakki -= 1;
                System.out.println(giris_hakki+" deneme hakkınız kaldı.");
            }
            if(giris_hakki == 0){
                System.out.println("Giriş hakkınız bitti.");

                return; // Metodu sonlandırır.
            }
        }

        while(true) {
            System.out.println("*****************");
            System.out.println("İşlemler....");
            System.out.println("1.Para Yatırma \n 2.Para Çekme \n 3.Bakiye Görüntüle\n 0.Çıkış");
            System.out.print("Yapmak istediğiniz işlemi seçiniz:");
            int a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.print("Yatırmak istediğiniz tutarı giriniz:");
                    double x = sc.nextDouble();
                    hesap.paraYatir(x);
                    break;

                case 2:
                    System.out.print("Çekmek istediğiniz tutarı giriniz:");
                    double y = sc.nextDouble();
                    hesap.paraCek(y);

                case 3:
                    System.out.println(hesap.getBakiye());


                case 0:
                    return;


            }

        }



    }
}

