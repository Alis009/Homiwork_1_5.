public class Hero {
    private int health;
    private int damage;
    private String superpower;

    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Hero(int damage, int health) {
        this.health = health;
        this.damage = damage;
    }

    public Hero(String superpower, int damage, int health) {
        this.superpower = superpower;
        this.damage = damage;
        this.health = health;
    }

    public int getHealth () {
        return this.health;
    }
    public int getDamage () {
        return this.damage;
    }
    public String getSuperpower () {
        return this.superpower;
    }
}
