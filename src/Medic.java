public class Medic extends Hero {
    public Medic(int health, int damage, String superAbilityType) {
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEAL");
    }
}