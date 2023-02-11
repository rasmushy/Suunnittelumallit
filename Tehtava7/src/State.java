public abstract class State {
    protected Pokemon pokemon;

    public State(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public abstract void attack();

    public abstract Pokemon evolve();

    public abstract void takeDamage(int damage);

    public abstract int getRequiredXp();
}

