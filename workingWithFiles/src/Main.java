import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();

    }

    public static void CreateNewFile() {
        File file = new File("C:\\Users\\ESA\\Desktop\\Java\\workingWithFiles\\student.txt");

        try {
            if (file.createNewFile())
                System.out.println("Dosya Oluşturuldu.");
            else
                System.out.println("Dosya zaten mevcut");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\ESA\\Desktop\\Java\\workingWithFiles\\student.txt");
        if (file.exists()) {
            System.out.println("Dosya Adı: " + file.getName());
            System.out.println("Dosya Yolu: " + file.getAbsolutePath());
            System.out.println("Dosya Yazılabilir mi: " + file.canWrite());
            System.out.println("Dosya Okunabilir mi: " + file.canRead());
            System.out.println("Dosya Boyutu (byte): " + file.length());
        }
    }
    public static void readFile(){
        File file=new File("C:\\Users\\ESA\\Desktop\\Java\\workingWithFiles\\student.txt");
        try {
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine()){
                String line =reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeFile(){
        try {
            BufferedWriter writer =new BufferedWriter(new FileWriter("C:\\Users\\ESA\\Desktop\\Java\\workingWithFiles\\student.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosyaya Yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
