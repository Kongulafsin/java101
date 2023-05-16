package Giris;
import java.util.Scanner;
public class VucutKitleİndeksi {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner input1 = new Scanner(System.in);
        System.out.print("Boy uzunlugunuzu giriniz(metre cinsinden) :");
        boy = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz(kg) :");
        kilo = input2.nextDouble();

        double vkindex = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz :"+vkindex);



    }
}
