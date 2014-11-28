/**
 * @Daniel Boonstra & Tjeerd Feddema
 */
public class Persoon
{
    public int bsn;
    public String voornaam;
    public String achternaam;
    public int geboortedatumDag;
    public int geboortedatumMaand;
    public int geboortedatumJaar;
    public char geslacht;
    public Dienblad dienblad;
    
    public Persoon(){
        
    }
    
    public Persoon(int bsn, String voornaam, String achternaam, int geboortedatumDag, int geboortedatumMaand, int geboortedatumJaar, char geslacht){
        setBsn(bsn);
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setGeboortedatum(geboortedatumDag, geboortedatumMaand, geboortedatumJaar);
        setGeslacht(geslacht);
    }
    
    /**
     * Sla de BSN van de gebruiker op
     */
    public void setBsn(int bsn)
    {
        this.bsn = bsn;
    }
    
    /**
     * Return de eventueel ingevoerde BSN
     */
     public String getBsn()
     {
         String temp;
         if(bsn == 0)
         {
             temp = "Onbekend";
         } 
         else 
         {
             temp = "" + bsn + "";
         }
         return temp;
    }
    
    /**
     * Sla de voornaam van de gebruiker op
     */
    public void setVoornaam(String voornaam)
    {
        this.voornaam = voornaam;
    }
    
    /**
     * Return de eventueel ingevoerde voornaam
     */
    public String getVoornaam(){
        String temp;
        if(voornaam == null){
            temp = "Onbekend";
        } else {
            temp = voornaam;
        }
        return temp;
    }
    
    /**
     * Sla de achternaam van de gebruiker op
     */
    public void setAchternaam(String achternaam)
    {
        this.achternaam = achternaam;
    }
    
    /**
     * Return de eventueel ingevoerde achternaam
     */
    public String getAchternaam(){
        String temp;
        if(achternaam == null){
            temp = "Onbekend";
        } else {
            temp = achternaam;
        }
        return temp;
    }
    
    /**
     * Controleer of de geboortedatum geldig is en sla deze daarna op
     */
    public void setGeboortedatum(int geboortedatumDag, int geboortedatumMaand, int geboortedatumJaar)
    {
        boolean check = false;
        
        if((geboortedatumDag >= 1) && 
           (geboortedatumMaand >= 1 && geboortedatumMaand <= 12) && 
           (geboortedatumJaar >= 1900 && geboortedatumJaar <= 2100))
        {
            switch (geboortedatumMaand){
                case 4:
                case 6:
                case 9:
                case 11:
                    if(geboortedatumDag <= 30){
                        check = true;
                    }
                break;
                
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if(geboortedatumDag <= 31){
                        check = true;
                    }
                break;
                
                case 2:
                    if((geboortedatumJaar % 4 == 0) && (geboortedatumJaar % 100 != 0) || (geboortedatumJaar % 400 == 0 )){
                        if(geboortedatumDag <= 29){
                           check = true;
                        }
                    } else {
                        if(geboortedatumDag <= 28){
                           check = true;
                        }
                    }
                break;
            }
        
        }
        
        if(check){
            this.geboortedatumDag = geboortedatumDag;
            this.geboortedatumMaand = geboortedatumMaand;
            this.geboortedatumJaar = geboortedatumJaar;
            System.out.println("Uw geboortedatum is aangepast naar " + this.geboortedatumDag + "-" + this.geboortedatumMaand + "-" + this.geboortedatumJaar);
        } else {
            geboortedatumDag = 0;
            geboortedatumMaand = 0;
            geboortedatumJaar = 0;
            System.out.println("De datum " + geboortedatumDag + "-" + geboortedatumMaand + "-" + geboortedatumJaar + " is niet geldig!");
        }
    }
    
    /**
     * Return de eventueel ingevoerde geboortedatum
     */
    public String getGeboortedatum(){
        String temp;
        if (geboortedatumDag == 0 && geboortedatumMaand == 0 && geboortedatumJaar == 0){
            temp = "Onbekend";
        } else {
            temp = geboortedatumDag+"/"+geboortedatumMaand+"/"+geboortedatumJaar;
        }
        
        return temp;
    }
    
    /**
     * Sla het geslacht van de gebruiker op
     */
    public void setGeslacht(char geslacht)
    {
        if (geslacht == 'm' || geslacht == 'M' || geslacht == 'V' || geslacht == 'v'){
            this.geslacht = geslacht;
        } else {
            System.out.println ("U zult M of V in moeten vullen!");
            this.geslacht = '0';
        }   
    }
    
    /**
     * Return de eventueel ingevoerde geboortedatum
     */
    public String getGeslacht()
    {
        String temp;
        temp = "Onbekend";
        if (geslacht == 'm'){
            temp = "Man";
        } 
        
        if (geslacht == 'v'){
            temp = "Vrouw";
        }
        return temp;
    }
    
    /**
     * Print alle instantievariabelen van de klasse 'Persoon'
     */
    public void drukAf()
    {
        System.out.println ("Burgerservicenummer: " + getBsn());
        System.out.println ("Voornaam: " + getVoornaam());
        System.out.println ("Achternaam: " + getAchternaam());
        System.out.println ("Geboortedatum: "  + getGeboortedatum());
        System.out.println ("Geslacht: " + getGeslacht()); 
        
    }    
    
    /**
     * Methode om dienblad te koppelen aan een persoon
     * @param dienblad
     */
    public void pakDienblad(Dienblad dienblad) {
        this.dienblad = dienblad;
    }
    
    /**
 * Methode om artikel te pakken en te plaatsen op het dienblad
 * @param artikel
 */
public void pakArtikel(Artikel artikel) {
    dienblad.voegToe(artikel);
}

/**
 * Methode om de totaalprijs van de artikelen
 * op dienblad dat bij de persoon hoort uit te rekenen
 * @return De totaalprijs
 */
public double getTotaalPrijs() {
    if(dienblad != null){
        return dienblad.getTotaalPrijs();
    } else {
        System.out.println("U heeft nog geen dienblad.");
        return dienblad.getTotaalPrijs();
    }
}

/**
 * Methode om het aantal artikelen op dienblad dat bij de
 * persoon hoort te tellen
 * @return Het aantal artikelen
 */
public int getAantalArtikelen() {
    return dienblad.getAantalArtikelen();
}



}
