package tehdas;

public class Jasper implements Henkilo {
    private String kengat;
    private String housut;
    private String lippis;
    private String tpaita;

    public Jasper() {
    }

    @Override
    public void pueVaate(VaateTehdas vaateTehdas) {
        kengat = vaateTehdas.createKengat().toString();
        housut = vaateTehdas.createHousut().toString();
        lippis = vaateTehdas.createLippis().toString();
        tpaita = vaateTehdas.createTpaita().toString();
    }

    @Override
    public String toString() {
        return "Jasperin vaatteet lueteltuna: " + kengat + ", " + housut + ", " + lippis + " ja " + tpaita;
    }
}
