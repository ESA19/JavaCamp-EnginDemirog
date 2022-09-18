import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(5);
        sayilar.add("Ankara");

        System.out.println(sayilar.size());
        sayilar.set(2,100);
        System.out.println(sayilar.get(0));
        /*sayilar.remove(0);
        sayilar.clear();*/

        for (Object i:sayilar)
        {
            System.out.println(i);
        }
    }
}