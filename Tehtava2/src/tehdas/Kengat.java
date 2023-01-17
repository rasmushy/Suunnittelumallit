package tehdas;

public class Kengat {
    private String merkki;

    public Kengat(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return "Kengät on merkiltään " + merkki;
    }
}
