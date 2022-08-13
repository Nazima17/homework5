public class Hero {
    private int health ;
    private int demage;
    private String superPower;

    public Hero(int health, int demage) {
        this.health = health;
        this.demage = demage;
    }

    public Hero(int health, int demage, String superPower) {
        this.health = health;
        this.demage = demage;
        this.superPower = superPower;
    }

    public int getHealth() {
        return health;
    }

    public int getDemage() {
        return demage;
    }

    public String getSuperPower() {
        return superPower;
    }
}
