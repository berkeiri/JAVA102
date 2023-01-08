package Game;

public class Location {
    Location(){
    }
    public static boolean onLocation(){
        System.out.println("lokasyondayız");
        return true;
    }
    public void Location(){
        System.out.println("nereye gitmek istersiniz:");
    }
    public static int buy(){
        Player player = new Player();
        if (player.getMoney() > 3) {
            player.setMoney(player.getMoney() - 3);
            System.out.println("item alındı kalan para:" + player.getMoney());
        }else {
            System.out.println("hatalı işlem "+player.getMoney());
        }
        return player.getMoney();
    }
}
