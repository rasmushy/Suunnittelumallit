import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
     * Toteuta data-rakenne ja sen käsittely joko pääsynvalvonnalla tai ilman pääsynvalvontaa.
     * Pääsynvalvonta dekoraattorilla.
     * Dekoraattori kysyy salasanan ennen kuin päästää tai on päästämättä käsiksi dataan.
     */
    public static void main(String[] args) {
        Map<String, String> rasmusData = new HashMap<String, String>();

        rasmusData.put("nimi", "Rasmus");

        IDataPaasy data = new Dekoraattori(new DataRakenne(rasmusData));
        IDataPaasy data2 = new DataRakenne(rasmusData);

        System.out.println("suojattuData: " + data.hae());

        System.out.println("suojaamatonData: " + data2.hae());
    }

}
