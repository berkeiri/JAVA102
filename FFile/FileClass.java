package FFile;

import java.io.*;

public class FileClass {
    //dosya oluşturma.
    public static void main(String[] args) throws IOException {
       File file = new File("FFile/patika.txt");

        try {
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("Yeni Dosya Oluştu.");
            } else {
                System.out.println("Dosya Zaten Mevcut.");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

        //file.delete() dosya silme
        //dosyanın byte değerini gösterme
        try {
            FileInputStream input= new FileInputStream("FFile/patika.txt");
            int i=input.read();
            while (i !=-1){
                System.out.print((char) i);
                i=input.read();
            }
            //hafızada gereksiz yer kaplamasın diye
            input.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        String metin="outputStream ogreniyorum!";
        try{
            FileOutputStream output= new FileOutputStream("FFile/patika.txt",true);
            //byte türünde eklemek zorundayız o yüzden burda metini byte çevirdik.
            byte[] array=metin.getBytes();
            output.write(array);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
