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

        CellPhone cellPhone1=new CellPhone(1,"apple","12 pro",400,10,256,7.5,6000,12,"white",10);
        CellPhone cellPhone2=new CellPhone(2,"samsung","ff222",500,10,128,5.9,5000,8,"black",5);
        CellPhone cellPhone3=new CellPhone(3,"apple","11 Plus",500,10,128,5.9,5000,8,"black",5);

        cellphone.add(cellPhone1);
        cellphone.add(cellPhone2);
        cellphone.add(cellPhone3);

        System.out.println("+-------------+-------+-------+-------+-------+-------+-------+-------+");
        System.out.printf("| %-12s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s |\n", "ID", "Brand", "Name", "Price", "Discount Rate", "Memory", "Screen", "Battery", "Color", "Stock");
        for (CellPhone name:cellphone){
            System.out.printf("| %-12d | %-5s | %-5s | %-5d | %-5d | %-5d | %-5.2f | %-5d | %-5s | %-5d |\n", name.getId(), name.getMarka(), name.getName(), name.getPrice(), name.getDiscountRate(), name.getMemory(), name.getScreen(), name.getBattery(), name.getColor(), name.getStok());
        }
        System.out.println("+-------------+-------+-------+-------+-------+-------+-------+-------+");

        return cellphone;

    }
    public static void getAllMarka(ArrayList<CellPhone> phones){
        for (CellPhone phone: phones) {
            System.out.println(phone.getMarka());
        }

    }

    public static void addCellPhone(){
        Scanner input=new Scanner(System.in);
        System.out.println("??r??n idsini giriniz:");
        int id=input.nextInt();
        System.out.println("??r??n markas??n?? giriniz:");
        String marka=input.nextLine();
        System.out.println("??r??n modelini giriniz:");
        String name=input.nextLine();
        System.out.println("??r??n??n ??cretini giriniz:");
        int price=input.nextInt();
        System.out.println("indirim oran??n?? giriniz:");
        int discountRate=input.nextInt();
        System.out.println("haf??zay?? giriniz:");
        int memory=input.nextInt();
        System.out.println("ekran boyutunu giriniz:");
        double screen=input.nextInt();
        System.out.println("bataryan??n maH??n?? giriniz:");
        int battery=input.nextInt();
        System.out.println("ramini giriniz");
        int ram=input.nextInt();
        System.out.println("rengini giriniz:");
        String color=input.nextLine();
        System.out.println("stok adetini giriniz:");
        int stok=input.nextInt();
        String cellphone= id +"cellphone";
        CellPhone cellPhone=new CellPhone(id++,marka,name,price,discountRate,memory,screen,battery,ram,color,stok);
        getPhones();

    }
    public static void getPhonesByMarka(ArrayList<CellPhone> phones, String marka) {
        for (CellPhone phone : phones) {
            if (phone.getMarka().equalsIgnoreCase(marka)) {
                System.out.println("MARKASI:"+phone.getMarka() + "MODEL??:" + phone.getName()+"F??YATI:"+phone.getPrice());

            }
        }


    }
    public static void search(){
        Scanner input=new Scanner(System.in);
        System.out.println("l??tfen arad??????n??z markay?? giriniz: ");
        String markayaGore=input.nextLine();
        CellPhone.getPhonesByMarka(CellPhone.getPhones(),markayaGore);
    }
}
