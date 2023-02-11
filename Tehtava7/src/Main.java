/**
 * @author rasmushy
 */
public class Main {
    /*
     * State: Määrittele pelihahmo ja sille kolme kehitysastetta.
     * Toteuta eri kehitysasteet State-mallin mukaisesti.
     * Pelihahmo voisi olla esim. Pokemon-hahmo Charmander, jonka kaksi muuta kehitysastetta ovat Charmeleon ja Charizard.
     * Määrittele pelihahmolle vähintään kolme erilaista toimintoa (metodia) siten, että käyttäytyminen riippuu pelihahmon tilasta.
     * Tilanvaihtojen pitää toteutua automaattisesti ”pinnan  alla”. Pääohjelma (client) ei siis vaihda Pokemonin tilaa.
     * Pääohjelmassa Pokemon tekee esim. luupissa  temppuja, joiden  seurauksena tila aina jossain vaiheessa vaihtuu.
     * Kirjoita sopivia tulostuksia, jotta tilanvaihdot havaitaan.
     */
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon(); // create pokemon
        for (int i = 0; i < 20; i++) { // xp loop to evolve pokemon
            pokemon.attack();
            if (i % 5 == 0) {
                pokemon.takeDamage(10);
            }
        }
    }
}
