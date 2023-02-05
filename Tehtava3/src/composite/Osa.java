package composite;

public class Osa implements Laiteosa {
    private String nimi;
    private int hinta;

    public Osa(String nimi, int hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }

    public int getHinta() {
        return hinta;
    }

    public String getNimi() {
        return nimi;
    }

    public void addOsa(Laiteosa osa) {
        throw new UnsupportedOperationException();
    }

    public void removeOsa(Laiteosa osa) {
        throw new UnsupportedOperationException();
    }

}