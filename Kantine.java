public class Kantine {
  private Kassa kassa;
  private KassaRij kassarij;
  public Persoon persoon;
  public Dienblad dienblad;
  public Artikel artikel1;
  public Artikel artikel2;

  /**
   * Constructor
   */
  public Kantine() {
    kassarij=new KassaRij();
    kassa=new Kassa(kassarij);
  }

  /**
   * In deze methode wordt een Persoon en Dienblad
   * gemaakt en aan elkaar
   * gekoppeld. Maak twee Artikelen aan en plaats 
   * deze op het dienblad.   
   * Tenslotte sluit de Persoon zich aan bij de rij 
   * voor de kassa.
   */
  public void loopPakSluitAan(Persoon persoon, Artikel artikel1, Artikel artikel2) {
    this.persoon = persoon;
    dienblad = new Dienblad();
    persoon.pakDienblad(dienblad);
    this.artikel1 = artikel1;
    this.artikel2 = artikel2;
    persoon.pakArtikel(artikel1);
    persoon.pakArtikel(artikel2);
    kassarij.sluitAchteraan(persoon);
  }

  /**
   * Deze methode handelt de rij voor de kassa af.
   */
  public void verwerkRijVoorKassa() {
    //while() {
      //omitted   
    //}
  }

  /**
   * Deze methode telt het geld uit de kassa
   * @return hoeveelheid geld in kassa
   */
  //public double hoeveelheidGeldInKassa() {
    //omitted
  //}

  /**
   * Deze methode geeft het aantal gepasseerde artikelen.
   * @return het aantal gepasseerde artikelen
   */
  //public int aantalArtikelen(){
    //omitted
  //}

  /**
   * Deze methode reset de bijgehouden telling van 
   * het aantal artikelen
   * en "leegt" de inhoud van de kassa.
   */
  public void resetKassa() {
    // omitted
  }
}
