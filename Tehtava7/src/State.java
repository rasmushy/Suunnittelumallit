public abstract class State {

    public void changeState(Pokemon pokemon, State state) {
        pokemon.changeState(state);
    }

    public abstract void attack();
    public abstract void evolve(Pokemon pokemon);

    public abstract void takeDamage(int damage);

    public abstract int getInitialHp();

    public abstract int getRequiredXp();
}

