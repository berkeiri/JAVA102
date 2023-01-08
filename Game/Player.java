package Game;

import java.util.Scanner;

public class Player {
    private static String name;
    private static int id;
    private static int healty;
    private static int damage;
    private static int money;

    Player(String name,int id,int healty,int damage,int money){
        this.name=name;
        this.id=id;
        this.healty=healty;
        this.damage=damage;
        this.money=money;
        System.out.println("nesne oluşturuldu"+damage+","+healty);
    }
    public Player(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void selectChar(){
        System.out.println("1. oyuncunu samuray");
        System.out.println("2. oyununcu okçu");
        System.out.println("3.oyuncu şovalye");
        System.out.println("birini seç:");
        Scanner input=new Scanner(System.in);
        int select=input.nextInt();
        switch (select){
            case 1:
                setDamage(5);
                setId(1);
                setMoney(15);
                setHealty(21);
                setName("samuray");
                System.out.println(getDamage());
                break;
            case 2:
                setDamage(7);
                setId(2);
                setMoney(20);
                setHealty(18);
                setName("okçu");
                System.out.println(getDamage());
                break;
            case 3:
                setDamage(8);
                setHealty(24);
                setId(3);
                setMoney(5);
                setName("cafer");
                System.out.println(getDamage());
                break;
            default:
                System.out.println("geçerli bir seçim yapınız");
        }
    }
}
