public class KantineSimulatie {
    private Kantine kantine;

    /**
     * Constructor
     */
    public KantineSimulatie() {
        kantine=new Kantine();
    }

    /**
     * Deze methode simuleert een aantal dagen in het 
     * verloop van de kantine
     * @param dagen
     */
    public void simuleer(int dagen, Persoon persoon1, Artikel artikel1, Artikel artikel2) {
        // Lus voor het aantal dagen.
        for(int k = 1; k <= dagen; k++) {
      
            int i = 7;
            // Lus voor het aantal personen
            for(int j = 0; j < 10 + i; j++){
                kantine.loopPakSluitAan(persoon1, artikel1, artikel2);
            }
      
            kantine.verwerkRijVoorKassa();
            double dagTotaal = kantine.hoeveelheidGeldInKassa();
            int aantalArtikelen = kantine.aantalArtikelen();
            System.out.println("Dag " + k + ": Er zit " + dagTotaal + " euro in de kassa. Totaal hebben we " + aantalArtikelen + " artikelen verkocht.");
            kantine.resetKassa();
        }
    }
}
