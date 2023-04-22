public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(100, 20, "magic damage"),
                new Medic(80, 10, "heal"),
                new Warrior(150, 30, "critical damage")};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }
    }
}