package maksismumyı;

import java.util.Scanner;

public class Maksismumyı {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1.sayı:");
        int a = scanner.nextInt();
        System.out.println("2.sayı:");
        int b = scanner.nextInt();
        System.out.println("3.sayı:");
        int c = scanner.nextInt();

        int max = a;
        int min = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        System.out.println("Maksimum Sayı " + max);
        System.out.println("Minimum Sayı " + min);

    }

}
