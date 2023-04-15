public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(20);
        boss.setProtect(30);
        System.out.println("Boss health " + boss.getHealth() + "\nBoss damage " + boss.getDamage()  +"\nBoss protect" + boss.getProtect());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getSuperPower());
        }
    }

    public static Hero[] createHeroes(){
        Hero physical = new Hero(200,20);
        Hero mag = new Hero(400,30, "magic");
        Hero thor = new Hero(250,15, "stun");
        Hero[] allHeroes = new Hero[]{physical, mag, thor};
        return allHeroes;
    }
}
