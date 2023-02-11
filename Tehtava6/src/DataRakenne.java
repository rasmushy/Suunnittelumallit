import java.util.HashMap;
import java.util.Map;

public class DataRakenne implements IDataPaasy {

    private Map<String, String> data = new HashMap<String, String>();

    public DataRakenne(Map<String, String> data) {
        this.data = data;
    }

    public IDataPaasy hae() {
        return this;
    }

    public void lisaa(String avain, String arvo) {
        data.put(avain, arvo);
    }

    public void poista(String avain) {
        data.remove(avain);
    }

    @Override
    public String toString() {
        if (data == null) {
            return "Data on tyhjä";
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            sb.append(entry.getKey() + " : " + entry.getValue());
        }
        return sb.toString();
    }

}
