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
  public void simuleer(int dagen) {
    // for lus voor dagen
    for(int k = 1; k <= dagen; k++) {
      // per dag nu even vast 10+i personen naar binnen
      // laten gaan, wordt volgende week veranderd
      // for lus voor personen
      int i = 7;
      for(int j = 0; j < 10 + i; j++){
        Persoon persoon1 = new Persoon(23423, "Daniel", "Boonstra", 25, 9, 1997, 'm');
        Artikel artikel1 = new Artikel("Cola", 1.95);
        Artikel artikel2 = new Artikel("Broodje Kaas", 0.95);
        kantine.loopPakSluitAan(persoon1, artikel1, artikel2);
      }
      
      kantine.verwerkRijVoorKassa();
      double dagTotaal = kantine.hoeveelheidGeldInKassa();
      int aantalArtikelen = kantine.aantalArtikelen();
      System.out.println("Dag " + k + ": Er zit " + dagTotaal + " euro in de kassa. Totaal hebben we " + aantalArtikelen + " artikelen verkocht.");
      kantine.resetKassa();
      // verwerk rij voor de kassa
      // toon dagtotalen (artikelen en geld in kassa)
      // reset de kassa voor de volgende dag
    }
  }
}
