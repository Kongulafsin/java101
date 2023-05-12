package Giris;
import java.util.Scanner;
public class DikUcgendeHipotenusHesaplama {
    public static void main(String[] args) {
        int a,b;
        Scanner input1 = new Scanner(System.in);
        System.out.print("Birinci Dik Kenar Uzunlugunu Giriniz :");
        a = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("İkinci Dik Kenar Uzunlugunu Giriniz :");
        b =  input2.nextInt();

        double c = Math.sqrt(a*a + b*b);

        System.out.println("Hipotenus Uzunluğu : "+c);
    }
}
