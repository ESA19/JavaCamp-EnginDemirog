public class KronometreThread implements Runnable{
    private Thread t;
    private String threadName;
    public KronometreThread(String threadName)
    {
        this.threadName=threadName;
        System.out.println("Oluşturuluyor : "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor: "+threadName);
        try {
            for (int i=1;i<=10;i++){
                System.out.println(threadName+":" +i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Kesildi: "+threadName);

        }
        System.out.println("Thread bitti : "+threadName);
    }
    public void Start(){
        System.out.println("Thread nesnesi oluşturuluyor");
        if (t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}
