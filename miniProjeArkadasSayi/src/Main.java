import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner myObj=new Scanner(System.in);
        int[]arkadasSayiMi=new int[2];
        int arkadasSayi1=0;
        int arkadasSayi2=0;

        for (int i=0;i<2;i++)
        {
            arkadasSayiMi[i]=myObj.nextInt();
        }

        for (int i=1;i<arkadasSayiMi[0];i++)
        {
            if (arkadasSayiMi[0]%i==0)
            {
                arkadasSayi1+=i;
            }

        }
        for (int i=1;i<arkadasSayiMi[1];i++)
        {
            if (arkadasSayiMi[1]%i==0)
            {
                arkadasSayi2+=i;
            }
        }
        if (arkadasSayiMi[0]==arkadasSayi2)
        {
            if (arkadasSayiMi[1]==arkadasSayi1)
            {
                System.out.println(arkadasSayiMi[0]+" "+arkadasSayiMi[1]+" arkadaş sayıdırlar.");
            }
        }
        else
        {
            System.out.println("Arkadaş Sayı Değillerdir");
        }

    }
}