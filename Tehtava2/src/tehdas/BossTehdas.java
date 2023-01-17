package tehdas;

public class BossTehdas implements VaateTehdas {

    public BossTehdas() {
    }

    @Override
    public Kengat createKengat() {
        return new Kengat("Boss");
    }

    @Override
    public Housut createHousut() {
        return new Housut("Boss");
    }

    @Override
    public Lippis createLippis() {
        return new Lippis("Boss");
    }

    @Override
    public Tpaita createTpaita() {
        return new Tpaita("Boss");
    }
}
