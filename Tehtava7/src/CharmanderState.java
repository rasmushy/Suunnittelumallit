public class CharmanderState extends State {

    private static State instance = new CharmanderState();
    private static final int initialHp = 39;
    private static final int requiredXp = 50;

    private CharmanderState() {
    }

    public static State getInstance() {
        return instance;
    }
    @Override
    public void attack() {
        System.out.println("Charmander used Ember!");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Charmander evolved into Charmeleon!");
        changeState(pokemon, CharmeleonState.getInstance());
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println("Charmander took " + damage + " damage!");
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
        return "Charmander";
    }

}
