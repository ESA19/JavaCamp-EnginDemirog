import matematik.DortIslem;
import matematik.logaritma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Adınız: ");
        String isim= scanner.nextLine();
        System.out.println("Merhaba: "+isim);


        DortIslem dortIslem=new DortIslem();

        System.out.println(dortIslem.topla(2,7));

        logaritma logaritma=new logaritma();

    }
}