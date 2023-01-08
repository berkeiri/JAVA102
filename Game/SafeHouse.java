package Game;

public class SafeHouse {
    SafeHouse(){}
    public static void heal(){
        Player player=new Player();
        player.setHealty(21);
        System.out.println("can yenilendi şimdiki can:"+player.getHealty());
    }
}
