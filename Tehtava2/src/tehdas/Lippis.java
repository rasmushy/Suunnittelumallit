package tehdas;

public class Lippis {
    private String merkki;

    public Lippis(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return "Lippis on merkiltään " + merkki;
    }
}
