package PatikaStore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
        Scanner input=new Scanner(System.in);
        System.out.println("Patika Ürün Yönetim paneli!");
        System.out.println("1-Notebook İşlemleri");
        System.out.println("2-Cep telefonu işlemleri");
        System.out.println("3-Marka Listele");
        int select=input.nextInt();

        switch (select){
            case 1:
                NoteBook.getNotebook();
                System.out.println("lütfen yapmak istediğiniz işlemi seçiniz:");
                System.out.println("isme göre sıralamak için 1e basın:");
                System.out.println("ürün eklemek için 2ye basınız:");
                int select1=input.nextInt();
                switch (select1) {
                    case 1 -> {
                        System.out.println("isme göre arama yapmak için 1e basın:");
                        NoteBook.search();
                    }
                    case 2 -> {
                        System.out.println("ürün eklemek için 2ye basınız:");
                        NoteBook.addNotebook();
                    }
                    default -> System.out.println("lütfen geçerli bir değer giriniz:");
                }
                break;
            case 2:
                CellPhone.getPhones();
                System.out.println("lütfen yapmak istediğiniz işlemi seçiniz:");
                System.out.println("isme göre sıralamak için 1e basın:");
                System.out.println("ürün eklemek için 2ye basınız:");
                int select2=input.nextInt();
                switch (select2) {
                    case 1 -> {
                        System.out.println("isme göre arama yapmak için 1e basın:");
                        CellPhone.search();
                    }
                    case 2 -> {
                        System.out.println("ürün eklemek için 2ye basınız:");
                        CellPhone.addCellPhone();
                    }
                    default -> System.out.println("lütfen geçerli bir değer giriniz:");
                }
                break;
            case 3:
                CellPhone.getAllMarka(CellPhone.getPhones());
                NoteBook.getAllMarka(NoteBook.getNotebook());
                break;
            case 0:
                System.out.println("çıkış yapıldı..");
            default:
                System.out.println("Geçerli bir seçim yapınız..");
        }

    }





}
