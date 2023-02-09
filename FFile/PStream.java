package FFile;

import java.io.*;

public class PStream {
    public static void main(String[] args) {
        try {
            //char veri girdik
            PrintStream output=new PrintStream("print.txt");
            output.print("naber lan değişik ben berke");
            output.close();
            FileInputStream file = new FileInputStream("print.txt");
            //utf8 cinsinden okumamızı sağlıyor türkçe kelimeleri okuyabiliyopruz
            InputStreamReader input = new InputStreamReader(file);

            int i = input.read();
            while (i!=-1){
                System.out.print((char)i);
                i=input.read();
            }
            input.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            //dosya okuma kolay yol
            FileReader input = new FileReader("FFile/patika.txt");

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        // dosya yazma kolay yol char türünden. Fakat önceki yazılanları sildi.
        String data = "Patika Java102 Dersleri";

        try {
            FileWriter output = new FileWriter("FFile/patika.txt");
            output.write(data);

            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        String data2 = "Java 102 Dersleriascascasc.";
        try {
            PrintWriter output = new PrintWriter("FFile/patika.txt");
            output.print(data2);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
