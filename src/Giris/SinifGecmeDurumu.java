package Giris;

import java.util.Scanner;

public class SinifGecmeDurumu {

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kİmya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();


        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        double avarage = (mat + fizik + kimya + turkce + muzik)/5.0;

        System.out.println("0rtalamanız: " + avarage);

        if(avarage <= 55) {
            System.out.println("Sınıfta Kaldınız! ");
            System.out.println("Ortalamanız: " + avarage);
        }
        else {
            System.out.println("Tebrikler sınıfı geçtiniz! ");
            System.out.println("Ortalamanız :"+avarage);
        }

    }
}
