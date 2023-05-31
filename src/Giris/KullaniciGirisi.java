package Giris;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
       String  userName, password;

       Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınız :");
        userName = inp.nextLine();

        System.out.print("Şifreniz :");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        }else{
            System.out.println("Bilgileriniz Yanlış !");

            System.out.println("Şifre değiştirmek için 1'i tuşlayınız :");
            System.out.println("Çıkış yapmak için 2'yi tuşlayınız :");
            int secenek = inp.nextInt();

            switch (secenek){
                case 1 :

                    Scanner input = new Scanner(System.in);
                    System.out.print("Yeni kullanıcı adınız :");
                    userName = input.nextLine();

                    System.out.print("Yeni şifreniz :");
                    password = input.nextLine();

                    System.out.print("Yeni kullanıcı adınız "+userName+" olarak değiştirildi");
                    System.out.println();

                    System.out.println("Yeni şifreniz "+password+" olarak değiştirildi");
                    break;
                case 2 :
                    System.out.println("Sistemden çıkış yaptınız. İyi gümler! ");
                    break;
                default:
                    System.out.println("Yanlış bir tuşa bastınız.");
            }
        }
    }
}
