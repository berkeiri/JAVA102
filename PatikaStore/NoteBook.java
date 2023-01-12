package PatikaStore;

import java.util.ArrayList;
import java.util.Scanner;

public class NoteBook{
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
    public NoteBook(int id, String marka, String name, int price, int discountRate, int stok, int memory, double screen, int battery, int ram, String color){
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
    public static ArrayList<NoteBook> getNotebook(){
        ArrayList<NoteBook> notebook=new ArrayList<>();

        NoteBook notebook1= new NoteBook(1,"lenovo","12 pro",400,10,5,512,6.4,4000,8,"white");
        NoteBook notebook2= new NoteBook(2,"acer","ff222",500,10,128,256,5.2,6000,12,"black");
        NoteBook notebook3= new NoteBook(3,"monster","11 Plus",500,10,128,128,7.2,5000,8,"red");

        notebook.add(notebook1);
        notebook.add(notebook2);
        notebook.add(notebook3);

        System.out.println("+-------------+-------+-------+-------+-------+-------+-------+-------+");
        System.out.printf("| %-12s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s |\n", "ID", "Brand", "Name", "Price", "Discount Rate", "Memory", "Screen", "Battery", "Color", "Stock");
        for (NoteBook name:notebook){
            System.out.printf("| %-12d | %-5s | %-5s | %-5d | %-5d | %-5d | %-5.2f | %-5d | %-5s | %-5d |\n", name.getId(), name.getMarka(), name.getName(), name.getPrice(), name.getDiscountRate(), name.getMemory(), name.getScreen(), name.getBattery(), name.getColor(), name.getStok());
        }
        System.out.println("+-------------+-------+-------+-------+-------+-------+-------+-------+");

        return notebook;

    }
    public static void getAllMarka(ArrayList<NoteBook> notebooks){
        for (NoteBook notebook: notebooks) {
            System.out.println(notebook.getMarka());
        }

    }
    public static void addNotebook(){
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
    public static void getNotebookByMarka(ArrayList<NoteBook> notebooks, String marka) {
        for (NoteBook notebook : notebooks) {
            if (notebook.getMarka().equalsIgnoreCase(marka)) {
                System.out.println("MARKASI:"+notebook.getMarka() + "MODELİ:" + notebook.getName()+"FİYATI:"+notebook.getPrice());

            }
        }


    }
    public static void search(){
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen aradığınız markayı giriniz: ");
        String markayaGore=input.nextLine();
        NoteBook.getNotebookByMarka(NoteBook.getNotebook(),markayaGore);
    }



}
