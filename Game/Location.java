package Game;

import java.util.Scanner;

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
        System.out.println("hangi silahı almak istersiniz? 1_tabanca 2_mızrak 3_hiçbişey");
        Scanner input=new Scanner(System.in);
        int select=input.nextInt();
        switch (select){
            case 1:
                if (player.getMoney() > 3) {
                    Inventory.gun();
                    player.setMoney(player.getMoney() - 3);
                    System.out.println("item alındı kalan para:" + player.getMoney());
                    break;
                }else {
                    System.out.println("para yetersiz.."+player.getMoney());
                }
            case 2:
                if (player.getMoney() > 7) {
                    Inventory.sword();
                    player.setMoney(player.getMoney() - 7);
                    System.out.println("item alındı kalan para:" + player.getMoney());
                    break;
                }else {
                    System.out.println("para yetersiz.."+player.getMoney());
                }
            case 3:
                break;

        }return player.getMoney();

    }
}
