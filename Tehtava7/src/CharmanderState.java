public class CharmanderState extends State {
    private int hp;
    private final int requiredXp = 50;

    public CharmanderState(Pokemon pokemon) {
        super(pokemon);
        this.hp = 39;
    }

    @Override
    public void attack() {
        System.out.println("Charmander used Ember!");
    }

    @Override
    public Pokemon evolve() {
        System.out.println("Charmander evolved into Charmeleon!");
        this.pokemon.changeState(new CharmeleonState(this.pokemon));
        return this.pokemon;
    }

    @Override
    public void takeDamage(int damage) {
        this.hp -= damage;
        System.out.println("Charmander took " + damage + " damage!");
        if (this.hp <= 0) {
            System.out.println("Charmander fainted!");
        }
    }

    @Override
    public String toString() {
        return "Charmander";
    }

    public int getRequiredXp() {
        return requiredXp;
    }
}
