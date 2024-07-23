public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setTypeOfProtection("physical");

        System.out.println("boss health " + boss.getHealth() + "boss damage" + boss.getDamage() + "boss typeOfProtection" + boss.getTypeOfProtection());
        createHeroes();

    }

    public static Hero[] createHeroes() {
        Hero hero = new Hero(700, 50, "physical");
        Hero myhero = new Hero(70, 600);
        Hero syperhero = new Hero("physical", 70, 500);

        Hero[] heroes = {hero, myhero, syperhero};

        for (Hero hero1 : heroes) {
            System.out.println(hero1);
        }
        return heroes;
    }

}
