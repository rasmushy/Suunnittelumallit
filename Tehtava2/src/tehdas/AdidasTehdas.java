package tehdas;

public class AdidasTehdas implements VaateTehdas {

    public AdidasTehdas() {

    }

    @Override
    public Kengat createKengat() {
        return new Kengat("Adidas");
    }

    @Override
    public Housut createHousut() {
        return new Housut("Adidas");
    }

    @Override
    public Lippis createLippis() {
        return new Lippis("Adidas");
    }

    @Override
    public Tpaita createTpaita() {
        return new Tpaita("Adidas");
    }
}
