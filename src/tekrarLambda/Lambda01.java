package tekrarLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

      /*  1) Lambda "Functional Programming"-->mathod(action) kullanma pr dili.
                Lambda --> mathod create  etme değil mevcut method'ları(library)secip kullanmaktır...
        Lambda  kendi başına tanımlanabilen parametre alıp gönderebilen fonksiyonlardır.
        Lambda’lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.
                Java 8 ile gelen bu özellik, Java 8’in en önemli özelliğidir.


        2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
        3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
        ve hatasiz code yazma acilarindan cok faydalidir.
        4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullanılmaz.
        Lambda kullanmak hatasız code kullanmaktır.

                Collections Nedir?
                Çoğu yazılım tek tek öğeler yerine öğelerden oluşan toplulukları depolar ve onlar üzerinde işlem
        yapar. Array’ler onlardan birisidir. Java Collections Framework, arraylerle yapılan işleri daha kolay
        yaptığı gibi, daha fazlasını da yapar.
                Java’da bir koleksiyon (collection - bazen container, ambar diye adlandırılır) nesnelerden oluşan bir
        topluluğu bir arada tutan bir yapıdır. ‘Collections Framework’ ise arayüzler ve onların kurgularından
                (implementations) oluşur.
                */

        List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));


        //Task1 : "Structured Programming" kullanarak list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.

        printElStructured(sayi);
        System.out.println("1-\n+*****");
        printElFunctional(sayi);
        System.out.println("2-\n+*****");
        printElCiftStructured(sayi);
        System.out.println("3-\n+*****");
        printElCiftFunctional(sayi);
        System.out.println("4-\n+*****");
        printElKucukFunctional(sayi);
        System.out.println("5-\n+*****");
        printElKucukFunctional(sayi);
        System.out.println("6-\n+*****");
        printElKucukFunctional(sayi);
        System.out.println("7-\n+*****");
        printElBuyukFunctional( sayi);

    }

    public static void printElStructured(List<Integer> sayi) {
        for (Integer w : sayi) {
            System.out.print(w + " ");
        }
        System.out.println();
    }

    public static void printElFunctional(List<Integer> sayi) {

        sayi.stream().forEach(t -> System.out.print(t + " "));

    }

    // Task2 : structured Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printElCiftStructured(List<Integer> sayi) {
        for (Integer z : sayi) {
            if (z % 2 == 0) {
                System.out.print(z + " ");
            }
        }
        System.out.print(" ");


    }

    public static void printElCiftFunctional(List<Integer> sayi) {
        sayi.stream().filter(k -> k % 2 == 0).forEach(Lambda01::yazdır);
    }

    public static void yazdır(int a) {
        System.out.print(a + " ");
    }


    public static boolean ciftBul(int b) {

        return b % 2 == 0;

    }
    //Task3 : functional Programming ile list elemanlarinin 34 den kucuk cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.

    public static void printElKucukFunctional(List<Integer> sayi) {

        sayi.stream().filter(c -> c % 2 == 0 && c < 34).forEach(Lambda01::yazdır);


    }
    //Task4 : functional Programming ile list elemanlarinin 34 den buyk veya cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.

    public static void printElBuyukFunctional(List<Integer> sayi) {

        sayi.stream().filter(c -> c % 2 == 0 && c > 34).forEach(Lambda01::yazdır);


    }
}
