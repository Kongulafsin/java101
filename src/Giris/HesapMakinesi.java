package Giris;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giririniz :");
          n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
          n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz :");
        select = input.nextInt();

        switch (select){
            case 1 :
                System.out.print("Toplam :"+(n1 + n2));
                break;
            case 2 :
                System.out.print("Fark :"+(n1 - n2));
                break;
            case 3 :
                System.out.print("Çarpım :"+(n1 * n2));
                break;
            case 4 :
                if(n2!=0){
                System.out.print("Bölüm :"+(n1 / n2));
                break;}
                else
                {
                    System.out.println("Bir sayı 0'a bölünemez.");
                    break;
                }
            default :
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyin.");
                break;


        }

    }
}
