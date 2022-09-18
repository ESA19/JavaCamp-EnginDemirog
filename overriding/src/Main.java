public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] baseKrediManagers=new BaseKrediManager[]{new OgrenciKrediManager(),new OgretmenKrediManager(), new TarimKrediManager()};

        for (BaseKrediManager krediManager:baseKrediManagers)
        {
            System.out.println(krediManager.hesapla(1000));
        }

        // methoda yazılan final keywordu base classın ovveride edilmemesini sağlar.


    }
}