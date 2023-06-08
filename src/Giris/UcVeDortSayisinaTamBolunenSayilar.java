package Giris;
import java.util.Scanner;
public class UcVeDortSayisinaTamBolunenSayilar {
    public static void main(String[] args) {
        int k,ort=0,sayac=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz :");
        k = input.nextInt();

        for(int i=0; i<=k; i++){
            if(i %3 ==0 && i%4 ==0) {
                if(i !=0 )sayac++;
                System.out.println(i);
                ort = ort + i;

            }
        }
        ort= ort/sayac;
        System.out.println("sayıların ortalaması :" +ort);
    }

}
