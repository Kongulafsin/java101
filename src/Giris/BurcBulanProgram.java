package Giris;
import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        int month, day;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz ay :");
        month = inp.nextInt();

        System.out.print("Doğduğunuz gün :");
        day = inp.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Oğlak burcu");
                    } else {
                        System.out.println("Kova burcu");
                    }
                }else System.out.println("Hatalı bir gün girdiniz !");
                break;
            case 2:
                if (day >= 1 && day <= 29) {
                    if (day < 20) {
                        System.out.println("Kova burcu");
                    } else {
                        System.out.println("Balık burcu");
                    }
                }else System.out.println("Hatalı bir gün girdiniz !");
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        System.out.println("Balık burcu");
                    } else {
                        System.out.println("Koç burcu");
                    }
                }else System.out.println("Hatalı bir gün girdiniz !");
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        System.out.println("Koç burcu");
                    } else {
                        System.out.println("Boğa burcu");
                    }
                }else System.out.println("Hatalı bir gün girdiniz !");
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Boğa burcu");
                    } else {
                        System.out.println("İkizler burcu");
                    }
                }else System.out.println("Hatalı bir gün girdiniz !");
                break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        System.out.println("ikizler burcu");
                    } else {
                        System.out.println("Yengeç burcu");
                    }
                }else System.out.println("Hatalı bir gün girdiniz !");
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Yengeç burcu");
                    } else {
                        System.out.println("Aslan burcu");
                    }
                }else System.out.println("Hatalı bir gün girdiniz !");
                break;
            case 8:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        System.out.println("Aslan burcu");
                    } else {
                        System.out.println("Başak burcu");
                    }
                }else System.out.println("Hatalı bir gün girdiniz !");
                break;
            case 9:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Başak burcu");
                    } else {
                        System.out.println("Terazi burcu");
                    }
                }else System.out.println("Hatalı bir gün girdiniz !");
                break;
            case 10:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        System.out.println("Terazi burcu");
                    } else {
                        System.out.println("Akrep burcu");
                    }
                }else System.out.println("Hatalı bir gün girdiniz !");
                break;
            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        System.out.println("Akrep burcu");
                    } else {
                        System.out.println("Yay burcu");
                    }
                }else System.out.println("Hatalı bir gün girdiniz !");
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Yay burcu");
                    } else {
                        System.out.println("Oğlak burcu");
                    }
                }else System.out.println("Hatalı bir gün girdiniz !");
                break;
            default:
                System.out.println("Hatalı bir ay girdiniz !");
        }
    }
}
