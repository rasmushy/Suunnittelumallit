public class Pokemon {
    private State state;
    private int xp;

    public Pokemon() {
        this.state = new CharmanderState(this);
        this.xp = 0;
    }

    public void evolve() {
        this.state.evolve();
    }

    public void attack() {
        this.state.attack();
        addXp(10);
    }

    public void takeDamage(int damage) {
        this.state.takeDamage(damage);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void addXp(int xp) {
        this.xp += xp;
        int left = this.state.getRequiredXp() - this.xp;
        if (left > 0) {
            System.out.println(this.state.toString() + " gained 10 xp! " + left + " xp required to evolve.");
        }

        if (this.xp >= this.state.getRequiredXp()) {
            this.evolve();
        }
    }

}

