public class CharizardState extends State {

    private static State instance = new CharizardState();
    private static final int initialHp = 78;
    private static final int requiredXp = 150;

    private CharizardState() {
    }

    public static State getInstance() {
        return instance;
    }

    @Override
    public void attack() {
        System.out.println("Charizard used Fire Blast!");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Charizard is already at its highest evolution!");
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println("Charizard took " + damage + " damage!");
    }

    @Override
    public int getInitialHp() {
        return initialHp;
    }

    @Override
    public int getRequiredXp() {
        return requiredXp;
    }

    @Override
    public String toString() {
        return "Charizard";
    }
}
