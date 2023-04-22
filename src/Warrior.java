public class Warrior extends Hero {
    public Warrior(int health, int damage, String superAbilityType) {
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }
}