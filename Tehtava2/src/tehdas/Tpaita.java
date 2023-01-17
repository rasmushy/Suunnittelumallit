package tehdas;

public class Tpaita {
    private String merkki;

    public Tpaita(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return "T-paita on merkiltään " + merkki;
    }
}
