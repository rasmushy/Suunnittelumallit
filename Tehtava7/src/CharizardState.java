public class CharizardState extends State {
    private int hp;
    private final int requiredXp = 150;

    public CharizardState(Pokemon pokemon) {
        super(pokemon);
        this.hp = 78;
    }

    @Override
    public void attack() {
        System.out.println("Charizard used Fire Blast!");
    }

    @Override
    public Pokemon evolve() {
        System.out.println("Charizard is already at its highest evolution!");
        return this.pokemon;
    }

    @Override
    public void takeDamage(int damage) {
        this.hp -= damage;
        System.out.println("Charizard took " + damage + " damage!");
        if (this.hp <= 0) {
            System.out.println("Charizard fainted!");
        }
    }

    @Override
    public String toString() {
        return "Charizard";
    }

    @Override
    public int getRequiredXp() {
        return requiredXp;
    }
}
