public class Pokemon {

    private State state;
    private int hp;
    private int xp;

    private final int maximumXp = 160;

    public Pokemon() {
        this.state = CharmanderState.getInstance();
        this.hp = state.getInitialHp();
        this.xp = 0;
    }

    public void evolve() {
        if (xp > maximumXp) {
            return;
        }
        this.state.evolve(this);
    }

    public void attack() {
        this.state.attack();
        xp += 10;
        if (xp >= state.getRequiredXp()) {
            evolve();
        }
    }

    public void takeDamage(int damage) {
        this.state.takeDamage(damage);
        hp -= damage;
        if (hp <= 0) {
            System.out.println(this.state.toString() + " fainted!");
        }
    }

    public void changeState(State state) {
        this.state = state;
        hp = state.getInitialHp();
    }

}

