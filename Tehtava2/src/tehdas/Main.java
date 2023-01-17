package tehdas;

public class Main {

    /*
    Abstract Factory: Jasper Java-koodaaja on koko opiskeluaikansa pukeutunut Adidas-merkkisiin vaatteisiin lippis ja
    kengät mukaan lukien. Kirjoita ohjelma, jossa Jasper pukee päällensä farmarit, t-paidan, lippiksen ja kengät.
    Tämän jälkeen tehdas.Jasper luettelee ylpeänä, mitä hänellä on päällään (vaatekappaleet osaavat toString-metodeissaan kertoa kaiken oleellisen itsestään).
    Valmistuttuaan insinööriksi tehdas.Jasper siirtyy käyttämään yksinomaan Boss-tuotteita ja osaa edelleen kertoa,
    mitä hänellä on päällään. Koodaa ohjelma siten, että Jasperiin ei tarvitse tehdä juuri muutoksia Adidas->Boss siirtymän takia,
    vaan ainoa muutos on tuoteperheen (tehtaan) vaihto. Bonus: Hyödynnä Java Reflection APIa tehtaan luonnissa.
    Lue tehtaan nimi ulkoisesta tiedostosta tai anna komentoriviargumenttina. Tästä yksi piste lisää, jos palautus ajoissa.
    Myöhästyneitä palautuksia ei huomioida.
    */
    public static void main(String[] args) {
        Henkilo jasper = new Jasper();
        VaateTehdas vaateTehdas = new AdidasTehdas();
        jasper.pueVaate(vaateTehdas);
        System.out.println(jasper);
        vaateTehdas = new BossTehdas();
        jasper.pueVaate(vaateTehdas);
        System.out.println(jasper);
    }
}