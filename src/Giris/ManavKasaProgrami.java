package Giris;
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.0;
        double ar, el, dom, mu, pat;
        Scanner inp1 = new Scanner(System.in);
        System.out.print("Armut kaç kilo :");
        ar = inp1.nextDouble();

        Scanner inp2 = new Scanner(System.in);
        System.out.print("Elma kaç kilo :");
        el = inp2.nextDouble();

        Scanner inp3 = new Scanner(System.in);
        System.out.print("Domates kaç kilo :");
        dom = inp3.nextDouble();

        Scanner inp4 = new Scanner(System.in);
        System.out.print("Muz kaç kilo :");
        mu = inp4.nextDouble();

        Scanner inp5 = new Scanner(System.in);
        System.out.print("Patlıcan  kaç kilo :");
        pat = inp5.nextDouble();

        double total = (armut * ar) + (elma * el) + (domates * dom) + (muz * mu) + (patlıcan * pat);

        System.out.print("Toplam tutar(Tl) :"+total);
    }
}
