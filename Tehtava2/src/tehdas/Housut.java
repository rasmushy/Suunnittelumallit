package tehdas;

public class Housut {
    private String merkki;

    public Housut(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return "Housut on merkiltään " + merkki;
    }


}
