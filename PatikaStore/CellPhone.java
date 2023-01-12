package PatikaStore;

import java.util.ArrayList;
import java.util.Scanner;

public class CellPhone {
    private int id;
    private String marka;
    private String name;
    private int price;
    private int discountRate;
    private int stok;
    private int memory;
    private double screen;
    private int battery;
    private int ram;
    private String color;


    public CellPhone(int id, String marka, String name, int price, int discountRate, int memory, double screen, int battery, int ram, String color, int stok) {
        this.id = id;
        this.marka = marka;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.stok = stok;
        this.memory = memory;
        this.screen = screen;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printFeatures() {
        System.out.println("Brand: " + this.getMarka());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Memory: " + this.getMemory());
        System.out.println("Screen Size: " + this.getScreen());
        System.out.println("Battery: " + this.getBattery());
        System.out.println("Color: " + this.getColor());
        System.out.println("Stock: " + this.getStok());
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void printFeaturesTable() {
        System.out.println("+-------------+-------+-------+-------+-------+-------+-------+-------+");
        System.out.printf("| %-12s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s |\n", "ID", "Brand", "Name", "Price", "Discount Rate", "Memory", "Screen", "Battery", "Color", "Stock");
        System.out.println("+-------------+-------+-------+-------+-------+-------+-------+-------+");
    }
    public static ArrayList <CellPhone> getPhones(){
        ArrayList<CellPhone> cellphone=new ArrayList<>();

        CellPhone cellPhone1=new CellPhone(1,"apple","cf600",400,10,128,5.9,5000,8,"white",3);
        CellPhone cellPhone2=new CellPhone(2,"samsung","ff222",500,10,128,5.9,5000,8,"black",5);

        cellphone.add(cellPhone1);
        cellphone.add(cellPhone2);
        System.out.println("+-------------+-------+-------+-------+-------+-------+-------+-------+");
        System.out.printf("| %-12s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s |\n", "ID", "Brand", "Name", "Price", "Discount Rate", "Memory", "Screen", "Battery", "Color", "Stock");
        for (CellPhone name:cellphone){
            System.out.printf("| %-12d | %-5s | %-5s | %-5d | %-5d | %-5d | %-5.2f | %-5d | %-5s | %-5d |\n", name.getId(), name.getMarka(), name.getName(), name.getPrice(), name.getDiscountRate(), name.getMemory(), name.getScreen(), name.getBattery(), name.getColor(), name.getStok());
        }
        System.out.println("+-------------+-------+-------+-------+-------+-------+-------+-------+");

        return cellphone;

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
                System.out.println("nootbook işlemleri");
                break;
            case 2:
                CellPhone.getPhones();
                break;
            case 3:
                System.out.println("markalar listelendi");
                break;
            case 0:
                System.out.println("çıkış yap");
            default:
                System.out.println("Geçerli bir seçim yapınız..");
        }

    }
    public static void addCellPhone(){
        Scanner input=new Scanner(System.in);
        System.out.println("ürün idsini giriniz:");
        int id=input.nextInt();
        System.out.println("ürün markasını giriniz:");
        String marka=input.nextLine();
        System.out.println("ürün modelini giriniz:");
        String name=input.nextLine();
        System.out.println("ürünün ücretini giriniz:");
        int price=input.nextInt();
        System.out.println("indirim oranını giriniz:");
        int discountRate=input.nextInt();
        System.out.println("hafızayı giriniz:");
        int memory=input.nextInt();
        System.out.println("ekran boyutunu giriniz:");
        double screen=input.nextInt();
        System.out.println("bataryanın maHını giriniz:");
        int battery=input.nextInt();
        System.out.println("ramini giriniz");
        int ram=input.nextInt();
        System.out.println("rengini giriniz:");
        String color=input.nextLine();
        System.out.println("stok adetini giriniz:");
    }
    public static void getPhonesByMarka(ArrayList<CellPhone> phones, String marka) {
        for (CellPhone phone : phones) {
            if (phone.getMarka().equalsIgnoreCase(marka)) {
                System.out.println(phone.getMarka() + " - " + phone.getPrice());

            }
        }


    }
}
