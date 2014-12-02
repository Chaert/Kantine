import java.util.LinkedList;

public class KassaRij {
    public LinkedList<Persoon> rij;
    
    /**
     * Constructor
     */
    public KassaRij() {
        rij = new LinkedList<Persoon>(); 
    }

    /**
     * Persoon sluit achter in de rij aan
     * @param persoon
     */
    public void sluitAchteraan(Persoon persoon) {
        rij.add(persoon);
    }

    /**
     * Indien er een rij bestaat, de eerste Persoon uit
     * de rij verwijderen en retourneren. 
     * Als er niemand in de rij staat geeft deze null terug.
     * @return Eerste persoon in de rij of null
     */
    public Persoon eerstePersoonInRij() {
        Persoon persoon;
        if(rij.size() > 0){
            persoon = rij.get(0);
            rij.remove(0);
        } else {
            persoon = null;
        }
      
        return persoon;
    }
  
    /**
     * Rijgrootte bepalen
     * @return Het aantal personen in de rij
     */
    public int rijGrootte(){
        return rij.size();
    }

    /**
     * Methode kijkt of er personen in de rij staan. 
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {
        boolean erIsEenRij = false;
        if(rij.size() > 0){
            erIsEenRij = true;
        }
    
        return erIsEenRij;
    }
}
