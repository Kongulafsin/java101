package Giris;
import java.util.Scanner;
public class DortSayisininKatlariToplami {

    public static void main(String[] args) {
        int n;
        int total = 0;

        Scanner inp = new Scanner(System.in);

        do{
            System.out.println("Sayı Giriniz :");
            n = inp.nextInt();

            if(n % 4 == 0) {
                total += n;
                System.out.println("Girilen sayı 4'ün katıdır !");
            }
        }while (n %2 ==0);
        System.out.println("Dördün katlarının toplamı :"+total);
        }

    }

