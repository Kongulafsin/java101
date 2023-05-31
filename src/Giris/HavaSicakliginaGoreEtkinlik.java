package Giris;

import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz :");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak yapabilirsiniz. ");
        } else if (heat >= 5 && heat<= 10 ) {
            System.out.println("Sinemaya gidebilirsiz. ");
        } else if (heat > 10 && heat <=15) {
            System.out.println("Sinemaya gidebilirsiniz. \nPiknik yapabilirsiniz. ");
            
        } else if (heat > 15 && heat <= 25) {
            System.out.println("Piknik yapabilirsiniz. ");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz. ");
        }
    }

}
