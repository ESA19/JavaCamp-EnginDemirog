import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner myObj=new Scanner(System.in);
        int sayi=myObj.nextInt();
        int bolenlerTop=0;
        for (int i=1;i<sayi;i++)
        {
            if (sayi % i == 0)
            {
                bolenlerTop += i;

            }

        }
        if (bolenlerTop==sayi)
        {
            System.out.println(sayi+" Mükemmel Sayıdır");
        }
        else
        {
            System.out.println("Mükemmel Sayı değildir!");
        }
    }
}