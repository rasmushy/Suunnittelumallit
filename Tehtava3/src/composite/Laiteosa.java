package composite;

public interface Laiteosa {
    public abstract int getHinta();

    public abstract String getNimi();

    public abstract void addOsa(Laiteosa osa);

    public abstract void removeOsa(Laiteosa osa);

}