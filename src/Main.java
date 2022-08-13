import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(20);
        boss.setHealth(600);
        boss.setDefence("Kinetic");
        System.out.println("boss damage: " + boss.getDamage());
        System.out.println("boss health : " + boss.getHealth());
        System.out.println("boss defence :" + boss.getDefence());
createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println( "Damage hero : "+createHeroes()[i].getDemage()+ "  "+ " Helth: " +createHeroes()[i
                    ].getHealth()+" "+"Superower: "+createHeroes()[i].getSuperPower());

        }
    }
    public static Hero[]createHeroes (){
        Hero megare  = new Hero (270,33,"swipe");
        Hero aid =new Hero(250,48);
        Hero zoro = new Hero(210,22);
        Hero[]heroes={megare,aid,zoro};
        return heroes;


    }
}