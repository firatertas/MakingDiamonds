import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        int line, star, space;
        System.out.print("Satır Giriniz : ");
        line = out.nextInt();
     /*
     n=6 için
     piramit satırı:  yıldız sayısı :  boşlık sayısı :
     1                  1               5
     2                  3               4
     3                  5               3
     4                  7               2
     5                  9               1
     6                  11              0
     n                  2n+1            n-1
      */
        /*
      1         *         3
      2        ***        2
      3       *****       1
      4      *******      0
      5       *****       1   3 1
      6        ***        2   2 2
      7         *         3   1 3

      satır : i
      boşlık: i/2-1
      yıldız: (i+2)/2
      */
       if (line%2==1) {
           for (int i = 0; i < (line + 1) / 2; i++) {
               for (space = 1; space < (line + 1) / 2 - i; space++) {
                   System.out.print(" ");
               }
               for (star = 1; star <= 2 * i + 1; star++) {
                   System.out.print("*");
               }
               System.out.println();
           }
           for (int i = (line - 1) / 2; i > 0; i--) {
               for (space = (line + 1) / 2 - i; space > 0; space--) {
                   System.out.print(" ");
               }

               for (star = (2 * i) - 1; star >= 1; star--) {
                   System.out.print("*");

               }
               System.out.println();
           }
       }else {
           System.out.println("Yıldızlar dan elması elde etmek için lütfen\ntek sayı giriniz!");
       }
//        for (int a=3; a>0; a--){
//            System.out.println(a);
//        }
    }
}