import composite.Laiteosa;
import composite.Osa;
import composite.CompositeOsa;

public class Main {

/*   3.	Composite: Suunnittele Composite-mallin mukaisesti rajapinnat ja toteutukset systeemille, jolla voit esittää pöytätietokoneen kokoonpanon ja laskea sen hinnan, kun kukin komponentti tietää oman hintansa.
    Idea on että tietokoneen kaikki osat ovat vaikkapa Laiteosa-rajapinnan toteuttajia. Laiteosalla on hinta.
    Laiteosia on erilaisia, esim:
    - muistipiiri
    - emolevy
    - prosessori
    - verkkokortti
    - näytönohjain
    - kotelo

    Näistä ainakin emolevy ja kotelo ovat koostekomponentteja. Näiden hinta muodostuu komponentin omasta hinnasta sekä mahdollisen sisällön eli liitettyjen komponenttien hinnasta.
    Rakenna pöytätietokonekokoonpano haluamistasi osista ja laske lopuksi kokoonpanon hinta ja tulosta se. Hinnan ilmoittava metodi palauttaa hinnan metodin paluuarvona.

    Hyvän mielen bonus:
    Esitä, kuinka voit luoda kaikki tuoteosat abstraktin tehtaan avulla.
    Esitä myös, kuinka konkreettista tehdasta vaihtamalla saat helposti lasketuksi eri tehtaiden tuottamien samanlaisten kokoonpanojen hintoja*/

    public static void main(String[] args) {
        Laiteosa muistipiiri = new Osa("muistipiiri", 100);
        Laiteosa prossu = new Osa("prossu", 200);
        Laiteosa näytönohjain = new Osa("näytönohjain", 2000);
        Laiteosa poweri = new Osa("poweri", 50);
        Laiteosa emolevy = new CompositeOsa("emolevy", 100);
        emolevy.addOsa(muistipiiri);
        emolevy.addOsa(prossu);
        emolevy.addOsa(näytönohjain);
        Laiteosa kotelo = new CompositeOsa("kotelo", 100);
        kotelo.addOsa(emolevy);
        kotelo.addOsa(poweri);
        System.out.println("Kokoonpanon hinta: " + kotelo.getHinta());
    }
}