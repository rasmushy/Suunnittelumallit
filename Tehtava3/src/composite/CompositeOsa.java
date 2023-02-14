package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeOsa implements Laiteosa {
    private String nimi;
    private int hinta;

    private List<Laiteosa> osat;

    public CompositeOsa(String nimi, int hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
        this.osat = new ArrayList<Laiteosa>();
    }

    public void addOsa(Laiteosa osa) {
        osat.add(osa);
    }


    public void removeOsa(Laiteosa osa) {
        osat.remove(osa);
    }

    public int getHinta() {
        int kokoHinta = hinta;
        for (Laiteosa osa : osat) {
            kokoHinta += osa.getHinta();
        }
        return kokoHinta;
    }

    public String getNimi() {
        return nimi;
    }
}
