import java.util.ArrayList;

public class Kantine {
    private Kassa kassa;
    private KassaRij kassarij;
    private KantineAanbod kantineaanbod;

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
    public void loopPakSluitAan(Persoon persoon, String[] artikelnamen) {
        Dienblad dienblad = new Dienblad();
        persoon.pakDienblad(dienblad);
        for(int i = 0; i<artikelnamen.length; i++){
            Artikel artikel = kantineaanbod.getArtikel(artikelnamen[i]);
            dienblad.voegToe(artikel);
        }
        kassarij.sluitAchteraan(persoon);
    }

    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() throws TeWeinigGeldException {
        int rijGrootte = kassarij.rijGrootte();
        while(rijGrootte > 0){
            kassa.rekenAf(kassarij.eerstePersoonInRij());
            rijGrootte--;
        }
    }

    /**
     * Deze methode 'get' de kassa
     * @return kassa;
     */
    public Kassa getKassa(){
        return kassa; 
    }
    
    /**
     * Deze methode 'set' het kantineaanbod
     * @param kantineaanbod;
     */
    public void setKantineAanbod(KantineAanbod kantineaanbod){
        this.kantineaanbod = kantineaanbod;
    }
    
    /**
     * Deze methode 'get' het kantineaanbod
     * @return kantineaanbod;
     */
    public KantineAanbod getKantineAanbod(){
        return kantineaanbod; 
    }
}
