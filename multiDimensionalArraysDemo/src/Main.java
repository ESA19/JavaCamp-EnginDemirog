public class Main {
    public static void main(String[] args)
    {
        String[][] sehirler=new String[3][3];
        sehirler[0][0]="İstanbul";
        sehirler[0][1]="Edirne";
        sehirler[0][2]="Bilecik";
        sehirler[1][0]="Konya";
        sehirler[1][1]="Ankara";
        sehirler[1][2]="Kırıkkale";
        sehirler[2][0]="İzmir";
        sehirler[2][1]="Aydın";
        sehirler[2][2]="Manisa";
        for (int i=0; i<sehirler.length;i++)
        {
            if (i==0)
            {
                System.out.println("Marmara Bölgesi");
            } else if (i==1)
            {
                System.out.println("İç Anadolu Bölgesi");
            } else if (i==2)
            {
                System.out.println("Ege Bölgesi");
            }
            for (int j=0;j< sehirler.length;j++)
            {

                System.out.println(sehirler[i][j]);
            }
            System.out.println("--------------------------------------");

        }
    }
}