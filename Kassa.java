import java.util.*;

public class Kassa {
    private KassaRij kassarij;
    private int aantalGepasseerdeArtikelen;
    private double hoeveelheidGeld;
    
    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        this.kassarij = kassarij;
    }

    /**
     * Vraag het aantal artikelen en de totaalprijs op.
     * @param persoon die moet afrekenen
     */
    public void rekenAf(Persoon persoon) {
        Dienblad dienblad = persoon.getDienblad();
        int aantal = getAantalDienbladArtikelen(dienblad);
        double bedrag = getDienbladTotaalPrijs(dienblad);
        aantalGepasseerdeArtikelen += aantal;
        hoeveelheidGeld += bedrag;
    }
    
    /**
     * Methode om de totaalprijs van de artikelen
     * op dienblad dat bij de persoon hoort uit te rekenen
     * @return De totaalprijs
     */
    public double getDienbladTotaalPrijs(Dienblad dienblad) {
        if(dienblad != null){
            Iterator<Artikel> iterator = dienblad.geefIterator();
            
            double totaalPrijs = 0.0;
            while(iterator.hasNext()){
                Artikel product = iterator.next();
                totaalPrijs += product.getPlainPrijs();
            }
        
            return totaalPrijs;
            
        } else {
            System.out.println("U heeft nog geen dienblad.");
            double totaalPrijs = 0.0;
            return totaalPrijs;
        }
    }
    
    /**
     * Methode om het aantal artikelen op dienblad dat bij de
     * persoon hoort te tellen
     * @return Het aantal artikelen
     */
    public int getAantalDienbladArtikelen(Dienblad dienblad) {      
        Iterator<Artikel> iterator = dienblad.geefIterator();
        
        int aantal = 0;
        
        while(iterator.hasNext()){
            Artikel product = iterator.next();
            aantal ++;
        }
        return aantal;
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
     * resetKassa 
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

