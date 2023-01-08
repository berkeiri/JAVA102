package Game;

public class BattleLoc{
    BattleLoc(){

    }

    public static void getMonster(){
        Monster monster=new Monster();
        monster.zombi();
    }
    public static void combat(){
        Player player=new Player();
        Monster.zombi();
        while (player.getHealty()>0 && Monster.getHealty()>0){
            System.out.println(Monster.getName());
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
    }

}
