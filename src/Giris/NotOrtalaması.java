package Giris;
 import java.util.Scanner;
public class NotOrtalaması {

    public static void main(String[] args) {
  int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input =new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kİmya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6.0;

        System.out.println("0rtalamanız: " +sonuc);

        String durum = sonuc >=60 ? "Geçti" : "Kaldı";

        System.out.println(durum);
    }
}
