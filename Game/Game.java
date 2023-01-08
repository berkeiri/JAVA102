package Game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        BattleLoc.getMonster();
        Player player=new Player();
        Monster monster=new Monster();
        Inventory inventory=new Inventory();
        player.selectChar();
        System.out.println("playerin gücü:"+player.getDamage()+"playerin parası:"+player.getMoney()+"playerin ismi:"+player.getName());
        Location.buy();
        System.out.println("şimdiki hasar"+player.getDamage());
        System.out.println(Monster.getDamage());
        System.out.println("canavar ile savaşılsın mı?");
        Scanner input=new Scanner(System.in);
        int select=input.nextInt();
        switch (select){
            case 1:
                BattleLoc.combat();
                System.out.println("adamın canı:"+player.getHealty()+"canavarın canı:"+Monster.getHealty());
                break;
            case 2:
                System.out.println("nereye gitmek istersiniz?");
            default:
                System.out.println("geçerli bir seçim yapınız.");

        }if (player.getHealty()==0){
            System.out.println("malesef oyunu kaybettiniz");
        }else {
            System.out.println("oyuna devam edebilirsiniz");
        }
        System.out.println("adamın sağlığı:"+player.getHealty());
        SafeHouse.heal();


    }
}
