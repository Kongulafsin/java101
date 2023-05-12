package Giris;
import java.util.Scanner;
public class KDVTutarıHesaplama {

    public static void main(String[] args) {
        double tutar, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarı Giriniz : ");
        tutar = input.nextDouble();

        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar :" +tutar);
        System.out.println("KDV Oranı :" +kdvOran);
        System.out.println("KDV Tutari :" +kdvTutar);
        System.out.println("KDV'li Tutar :" +kdvliTutar);


    }
}
