public class CharmeleonState extends State {

    private static State instance = new CharmeleonState();
    private static final int initialHp = 58;
    private static final int requiredXp = 100;
    private CharmeleonState() {
    }

    public static State getInstance() {
        return instance;
    }
    @Override
    public void attack() {
        System.out.println("Charmeleon used Flamethrower!");
    }
    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Charmeleon evolved into Charizard!");
        changeState(pokemon, CharizardState.getInstance());
    }
    @Override
    public void takeDamage(int damage) {
        System.out.println("Charmeleon took " + damage + " damage!");
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
        return "Charmeleon";
    }
}
