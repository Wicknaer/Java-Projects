package NesneYonelimliaATM;

public class Main {
    public static void main(String args[]){

        Hesap hsp = new Hesap("bahadir","domates",2000);

        ATM atm = new ATM();
        atm.calis(hsp);


        System.out.println("Sistemden Çıkılıyor...");
    }
}
