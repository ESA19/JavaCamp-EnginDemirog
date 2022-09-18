public class Main {
    public static void main(String[] args) {
        //For
        for (int i=0;i<10;i++)
        {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti!");

        //While
        int i=1;
        while(i<10)
        {
            System.out.println(i);
            i+=2;

        }
        System.out.println("While Döngüsü Bitti!");

        //Do-While Döngüsü
        int k=100;
        do
        {
            k-=2;
            System.out.println(k);
        }while(k<10);
        System.out.println("Do-While Döngüsü Bitti!");
    }
}