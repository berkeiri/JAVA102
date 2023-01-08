package Game;

public class Monster {
    private static String name;
    private static int id;
    private static int damage;
    private static int healty;
    private static int money;
    Monster(String name,int id,int damage,int healty,int money){
        this.name=name;
        this.damage=damage;
        this.healty=healty;
        this.money=money;
        this.id=id;

    }

    public Monster() {

    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Monster.name = name;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Monster.id = id;
    }

    public static int getDamage() {
        return damage;
    }

    public static void setDamage(int damage) {
        Monster.damage = damage;
    }

    public static int getHealty() {
        return healty;
    }

    public static void setHealty(int healty) {
        Monster.healty = healty;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Monster.money = money;
    }

    public static void zombi(){
        setId(1);
        setDamage(3);
        setHealty(10);
        setMoney(4);
    }
}
