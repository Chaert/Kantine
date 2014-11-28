import java.util.ArrayList;

public class Kassa {
  public KassaRij kassarij;
  public int aantalGepasseerdeArtikelen;
  public double hoeveelheidGeld;
  /**
   * Constructor
   */
  public Kassa(KassaRij kassarij) {
      this.kassarij = kassarij;
  }

  /**
   * vraag het aantal artikelen en de totaalprijs op.
   * De implementatie wordt later vervangen 
   * door een echte betaling door de persoon. 
   * @param persoon die moet afrekenen
   */
  public void rekenAf(Persoon persoon) {
     System.out.println("Hier komt de info");
     persoon = persoon;
     int aantal = persoon.getAantalArtikelen();
     double bedrag = persoon.getTotaalPrijs();
     aantalGepasseerdeArtikelen += aantal;
     hoeveelheidGeld += bedrag;
  }

  /**
   * Geeft het aantal artikelen dat de kassa 
   * heeft gepasseerd, 
   * vanaf het moment dat de methode resetKassa 
   * is aangeroepen.
   * @return aantal artikelen
   */
  public int aantalArtikelen() {
    return aantalGepasseerdeArtikelen;
  }

  /**
   * Geeft het totaalbedrag van alle artikelen die
   * de kassa zijn gepasseerd, vanaf het moment dat de methode
   *resetKassa 
   * is aangeroepen.
   * @return hoeveelheid geld in de kassa
   */
  public double hoeveelheidGeldInKassa() {
    return hoeveelheidGeld;
  }

  /**
   * reset de waarden van het aantal gepasseerde artikelen en 
   * de totale hoeveelheid geld in de kassa.
   */
  public void resetKassa() {
    hoeveelheidGeld = 0;
    aantalGepasseerdeArtikelen = 0;
  }
}

