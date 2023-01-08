package Game;

public class Inventory {
    private static boolean water=false;
    private static boolean food=false;
    private static boolean firewood=false;
    private static String weaponName;
    private static String armorName;
    private static int weaponDamage=0;
    private static int armorDefence=0;
    Inventory(boolean water,boolean food,boolean firewood,String weaponName,int weaponDamage,int armorDefence,String armorName){
        this.water=water;
        this.food=food;
        this.firewood=firewood;
        this.weaponName=weaponName;
        this.weaponDamage=weaponDamage;
        this.armorDefence=armorDefence;
        this.armorName=armorName;
    }
    Inventory(){}
    public static boolean isWater() {
        return water;
    }
    public static void setWater(boolean water) {
        Inventory.water = water;
    }
    public static boolean isFood() {
        return food;
    }
    public static void setFood(boolean food) {
        Inventory.food = food;
    }
    public static boolean isFirewood() {
        return firewood;
    }
    public static void setFirewood(boolean firewood) {
        Inventory.firewood = firewood;
    }
    public static int getWeaponDamage() {
        return weaponDamage;
    }
    public static void setWeaponDamage(int weaponDamage) {
        Inventory.weaponDamage = weaponDamage;
    }
    public static int getArmorDefence() {
        return armorDefence;
    }
    public static void setArmorDefence(int armorDefence) {
        Inventory.armorDefence = armorDefence;
    }
    public static String getWeaponName() {
        return weaponName;
    }
    public static void setWeaponName(String weaponName) {
        Inventory.weaponName = weaponName;
    }
    public static String getArmorName() {
        return armorName;
    }
    public static void setArmorName(String armorName) {
        Inventory.armorName = armorName;
    }

    public static int gun(){
        Player player = new Player();
        System.out.println("tabanca elde edildi");
        setWeaponDamage(25);
        setWeaponName("tabanca");
        player.setDamage(getWeaponDamage()+player.getDamage());
        return player.getDamage();
    }
    public static int sword(){
        Player player = new Player();
        System.out.println("kilic elde edildi");
        setWeaponDamage(10);
        setWeaponName("tabanca");
        player.setDamage(getWeaponDamage()+player.getDamage());
        return player.getDamage();
    }
}
