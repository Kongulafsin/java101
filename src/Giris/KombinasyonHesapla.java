package Giris;
import java.util.Scanner;
public class KombinasyonHesapla {
    public static void main(String[] args) {

        long farkFak=1, fakSayi1=1, fakSayi2=1 ,fark, sayi1, sayi2;
        double com;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz :");
        sayi1 = input.nextInt();

        Scanner inp = new Scanner(System.in);
        System.out.print("ikinci Sayıyı Giriniz :");
        sayi2 = inp.nextInt();

        if (sayi1 < sayi2) {
            System.out.println("ikinci sayı ilk sayıdan buyuk olamaz !");
        }

        else {
            fark = sayi1 - sayi2;

            for (int k = 1; k <= fark; k++) {

                farkFak = farkFak * k;
            }

            for (int i = 1; i <= sayi1; i++) {

                fakSayi1 = fakSayi1 * i;
            }

            for (int j = 1; j <= sayi2; j++) {

                fakSayi2 = fakSayi2 * j;
            }

            com = fakSayi1 / (fakSayi2 * farkFak);
            System.out.println("Kombinasyon değeri :" +com);
        }
    }
}
