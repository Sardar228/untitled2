class Hero {
    private int health;
    private int damage;
    private String superpower;

    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}

class Boss {
    private int health;
    private int damage;
    private String defenseType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }
}

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        Hero[] heroes = createHeroes();

        System.out.println("Информация о боссе:");
        System.out.println("Здоровье: " + boss.getHealth());
        System.out.println("Урон: " + boss.getDamage());
        System.out.println("Тип защиты: " + boss.getDefenseType());

        System.out.println("Информация о героях:");
        for (Hero hero : heroes) {
            System.out.println("Здоровье: " + hero.getHealth());
            System.out.println("Урон: " + hero.getDamage());
            System.out.println("Суперспособность: " + hero.getSuperpower());
            System.out.println();
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Flight");
        Hero hero2 = new Hero(80, 30);
        Hero hero3 = new Hero(120, 25, "Invisibility");

        Hero[] heroes = { hero1, hero2, hero3 };
        return heroes;
    }
}
