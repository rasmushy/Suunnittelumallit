import java.util.Scanner;

public class Dekoraattori extends DataSuoja {

    Scanner lukija = new Scanner(System.in);

    public Dekoraattori(IDataPaasy data) {
        super(data);
    }

    @Override
    public IDataPaasy hae() {
        if (salasanaOikein()) {
            return super.hae();
        }
        return null;
    }

    private boolean salasanaOikein() {
        String salasana = "salasana";
        System.out.println("Anna salasana: ");
        String syote = lukija.nextLine();
        if (syote.equals(salasana)) {
            System.out.println("Salasana oikein");
            return true;
        }
        System.out.println("Salasana väärin");
        return false;
    }
}
