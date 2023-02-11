public class CharmeleonState extends State {
    private int hp;
    private final int requiredXp = 150;

    public CharmeleonState(Pokemon pokemon) {
        super(pokemon);
        this.hp = 58;
    }

    @Override
    public void attack() {
        System.out.println("Charmeleon used Flamethrower!");
    }

    @Override
    public Pokemon evolve() {
        System.out.println("Charmeleon evolved into Charizard!");
        this.pokemon.changeState(new CharizardState(this.pokemon));
        return this.pokemon;
    }

    @Override
    public void takeDamage(int damage) {
        this.hp -= damage;
        System.out.println("Charmeleon took " + damage + " damage!");
        if (this.hp <= 0) {
            System.out.println("Charmeleon fainted!");
        }
    }

    @Override
    public String toString() {
        return "Charmeleon";
    }

    public int getRequiredXp() {
        return requiredXp;
    }
}
