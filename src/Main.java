import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
    //toplama metodu, static metot içinde farklı metot çağırmak için static tanımlamalısın
    static int sum (int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static int minus (int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }
    static int times (int a, int b) {
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }
    static int divided (int a, int b) {
        if (b==0) {
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme: "+ result);
        return result;
    }
    static int power (int a, int b) {
        int result = 1;
        for (int i=1; i<=b; i++) {
            result *= a;
        }
        return result;
    }
    static int mod (int a, int b) {
        int result = a%b;
        return result;
    }
    static void calcRect(int a, int b) {
        int cevre = (2*a) + (2*b);
        int alan = a*b;
        System.out.print("Çevresi: " + cevre);
        System.out.print("Alanı: "+ alan);
    }
    static int factorial (int a) {
        int result = 1;
        for (int i=1; i<=a; i++) {
            result *= i;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Faktoriyel Hesaplama\n"
                    + "7- Mod Alma\n"
                    + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap";
        System.out.println(menu);
        System.out.println("=============");


        while (true) {
            System.out.print("Bir işlem seçiniz: ");
            select = scan.nextInt();
            if (select ==0 ){
                break;
            }
            System.out.print("Birinci sayıyı giriniz: ");
            int a = scan.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;

                case 2:
                    minus(a, b);
                    break;

                case 3:
                    times(a, b);
                    break;

                case 4:
                    if (divided(a,b) == 0) {
                        System.out.println("İkinci sayı sıfırdan farklı olmalı");
                    }
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Üs hesabı: " + power(a,b));
                    break;
                case 6:
                    System.out.println("Faktoriyel: " + factorial(a));
                    break;
                case 7:
                    System.out.println("Mod işlemi: " + mod(a,b));
                    break;
                case 8:
                    calcRect(a,b);
                    break;

                default:
                    System.out.println("Geçersiz sayı girdiniz.");
            }
        }
        System.out.print("Güle güle");
    }
}
