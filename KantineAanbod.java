import java.util.*;

public class KantineAanbod {
    // interne opslag voorraad
    private HashMap<String, ArrayList<Artikel>> aanbod;
    private double[] prijs;
    private int[] hoeveelheid;
    private String[] artikelnaam;
    
    // minimum voorraad
    private static final int MINIMUM_VOORRAAD = 5000;
    
    /**
     * Constructor. Het eerste argument is een lijst met artikelnamen,
     * het tweede argument is een lijst met prijzen en het derde argument
     * is een lijst met hoeveelheden. Let op: de dimensies van de drie arrays
     * moeten wel gelijk zijn!
     */
    public KantineAanbod(String[] artikelnaam, double[] prijs, int[] hoeveelheid) {
        this.artikelnaam = artikelnaam;
        this.hoeveelheid = hoeveelheid;
        this.prijs = prijs;
        
        aanbod=new HashMap<String, ArrayList<Artikel>>();
        for(int i=0;i<artikelnaam.length;i++) 
        {
            ArrayList<Artikel> artikelen=new ArrayList<Artikel>();
            for(int j=0;j<hoeveelheid[i];j++) 
            {
                artikelen.add(new Artikel(artikelnaam[i], prijs[i]));
            }
            aanbod.put(artikelnaam[i], artikelen);
        }
    }

    /**
     * Private methode om de lijst van artikelen te krijgen op basis van de    
     * naam van het artikel. Retourneert null als artikel niet bestaat.
     */
    private ArrayList<Artikel> getArrayList(String productnaam) {
         return aanbod.get(productnaam); 
    }

    /**
     * Controleer of de hoeveelheid op voorraad nog boven het MINIMUM_VOORRAAD ligt.
     * Zo nee, voer dan de methode vulVoorraadAan uit
     */
    public void checkVoorraad(){
        for (int index = 0; index < artikelnaam.length; index++){
            ArrayList<Artikel> artikelen = aanbod.get(artikelnaam[index]);
            if(artikelen.size() < MINIMUM_VOORRAAD){
                vulVoorraadAan(index);
            }
        }
    }
    
    /**
     * Private methode om een Artikel van de stapel artikelen af te pakken. 
     * Retourneert null als de stapel leeg is.
     */
    private Artikel getArtikel(ArrayList<Artikel> stapel) {
        if (stapel==null) { 
            return null;
        }
        
        if (stapel.size()==0)
        {
           return null;
        }
        else 
        {
            Artikel a=stapel.get(0);
            stapel.remove(0);
            return a;
        }
    }
    
    /**
     * Vul de voorraad aan van het desbetreffende artikel
     * @param index van het artikel
     */
    private void vulVoorraadAan(int index){
        ArrayList<Artikel> artikelen = aanbod.get(artikelnaam[index]);
        while(artikelen.size() < hoeveelheid[index]){
            artikelen.add(new Artikel(artikelnaam[index], prijs[index]));
        }
        
    }

    /**
     * Publieke methode om een artikel via naam van de stapel te pakken.
     * Retouneert null als artikel niet bestaat of niet op voorraad is.
     * @param naam (van artikel)
     * @return artikel (of null)
     */
    public Artikel getArtikel(String naam) {
        return getArtikel(getArrayList(naam));
    }
}
