package Game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Player player=new Player();
        Monster monster=new Monster();
        Inventory inventory=new Inventory();
        Location location=new Location();
        player.selectChar();
        System.out.println("playerin gücü:"+player.getDamage()+"playerin parası:"+player.getMoney()+"playerin ismi:"+player.getName());
        Location.buy();
        System.out.println("adamın parası:"+player.getMoney());
        Location.onLocation();
        location.Location();
        System.out.println("şimdiki hasar"+player.getDamage());
        Monster.zombi();
        System.out.println(Monster.getDamage());
        Inventory.gun();
        System.out.println("canavar ile savaşılsın mı?");
        Scanner input=new Scanner(System.in);
        int select=input.nextInt();
        switch (select){
            case 1:
                while (player.getHealty()>0 && Monster.getHealty()>0){
                    Monster.setHealty(Monster.getHealty()-player.getDamage());
                    System.out.println("adam "+player.getDamage()+"vurdu");
                    System.out.println("canavarın canı:"+Monster.getHealty());
                    while (player.getHealty()>0 && Monster.getHealty()>0){
                        player.setHealty(player.getHealty()-Monster.getDamage());
                        System.out.println("canavar "+Monster.getDamage()+"vurdu");
                        System.out.println("karakterin canı:"+player.getHealty());
                        break;
                    }

                }
                System.out.println("adamın canı:"+player.getHealty()+"canavarın canı:"+Monster.getHealty());
                break;

        }if (player.getHealty()==0){
            System.out.println("malesef oyunu kaybettiniz");
        }else {
            System.out.println("oyuna devam edebilirsiniz");
        }


    }
}
