import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner myObj=new Scanner(System.in);
        int aranacak=myObj.nextInt();
        sayiBulma(aranacak);

    }
    public static void sayiBulma(int aranacak)
    {
        int [] sayilar=new int[]{1,2,5,7,9,8,0,123,45};
        boolean result=false;
        for (int sayi:sayilar)
        {
            if (aranacak==sayi)
            {
                result=true;
                break;
            }
        }
        System.out.println(result);
    }
}