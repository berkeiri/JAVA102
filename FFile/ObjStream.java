package FFile;
import java.io.*;
import java.util.Arrays;

public class ObjStream {
    public static void main(String[] args) {
        //Seriazeable mutlaka yazılmalı yoksa dosyayı okuyamayız. Car sınıfında oluşturduk
        //txt oluşturup araba nesnesi oluşturduk
        Car c1 = new Car("audi", "2020");
        try {
            FileOutputStream file = new FileOutputStream("FFile/araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //dosyadaki nesneleri okuduk.
        try {
            FileInputStream inputFile = new FileInputStream("FFile/araba.txt");
            ObjectInputStream inputStream = new ObjectInputStream(inputFile);
            Car newCar = (Car) inputStream.readObject();
            System.out.println(newCar.getModel()); 
            System.out.println(newCar.getBrand());
            //dosyaları kapamayı unutmuyoruz
            inputFile.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
