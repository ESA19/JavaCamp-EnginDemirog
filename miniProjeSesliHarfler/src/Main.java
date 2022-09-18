import java.util.Objects;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args)
    {
        Scanner myObj=new Scanner(System.in);
        String a=myObj.next();
        String[]kalinSesli={"A","I","O","U"};
        String[]inceSesli={"E","İ","Ö","Ü"};

        for (String value : kalinSesli) {
            if (Objects.equals(a, value)) {
                System.out.println("Kalın Sesli Harf");
                break;
            }
        }
        for (String s : inceSesli) {
            if (Objects.equals(a, s)) {
                System.out.println("İnce Sesli Harf");
                break;
            }
        }



    }
}