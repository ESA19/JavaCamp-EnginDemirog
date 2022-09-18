import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int a = myObj.nextInt();
        int[] bolenler = new int[100];
        boolean isPrime = true;
        if (a < 1) {
            System.out.println("Geçersiz Sayı");
            return;
        } else if (a == 1) {
            System.out.println("1 Asal Sayı Değildir");
            return;
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
                bolenler[i - 2] = i;
            }

        }
        if (isPrime) {
            System.out.println("Sayı Asaldır");
        } else {
            System.out.println("Sayı Asal Değildir");
            for (int d : bolenler) {
                System.out.println(d);
            }
        }
    }
}