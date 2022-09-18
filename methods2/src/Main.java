public class Main {
    public static void main(String[] args) {
        String yeniMesaj = sehirVer();
        System.out.println("Eklendi");
        int sayi=topla(5,34);
        System.out.println(sayi);
        int sayilar=topla2(2,5,4,67,988,322,12,3243);
        System.out.println(sayilar);

    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static String sehirVer() {
        return "Ankara";
    }
    public static int topla(int a,int b)
    {
        return a+b;
    }
    public static int topla2(int...sayilar)
    {
        int toplam=0;
        for (int sayi:sayilar)
        {
            toplam+=sayi;
        }
        return toplam;
    }
}