import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(20);
        boss.setHealth(600);
        boss.setDefence("Kinetic");
        System.out.println("boss damage: "+boss.getDamage() );
System.out.println("boss health : " + boss.getHealth());
System.out.println("boss defence :"+boss.getDefence());

    }
}