/**
 * @Daniel Boonstra & Tjeerd Feddema
 */
public class Persoon
{
    public int BSN;
    public String voornaam;
    public String achternaam;
    public int geboortedatumDag;
    public int geboortedatumMaand;
    public int geboortedatumJaar;
    public char geslacht;
    
    public int BSNTemp;
    public String voornaamTemp;
    public String achternaamTemp;
    public String geboortedatumTemp;
    public String geslachtTemp;
    
    public Persoon(int persoonBSN, String persoonVoornaam, String persoonAchternaam, int persoonGeboortedatumDag, int persoonGeboortedatumMaand, int persoonGeboortedatumJaar, char persoonGeslacht){
        setBSN(persoonBSN);
        setVoornaam(persoonVoornaam);
        setAchternaam(persoonAchternaam);
        setGeboortedatum(persoonGeboortedatumDag, persoonGeboortedatumMaand, persoonGeboortedatumJaar);
        setGeslacht(persoonGeslacht);
    }
    
    /**
     * Set BSN
     */
    public void setBSN(int persoonBSN)
    {
        BSN = persoonBSN;
    }
    
    /**
     * Get BSN
     */
     public int getBSN(){
            
         BSNTemp = BSN;
         return BSNTemp;
    }
    
    /**
     * Set voornaam
     */
    public void setVoornaam(String persoonVoornaam)
    {
        voornaam = persoonVoornaam;
    }
    
    /**
     * Get voornaam
     */
    public String getVoornaam(){
        
        voornaamTemp = voornaam;
        return voornaamTemp;
    }
    
    /**
     * Set achternaam
     */
    public void setAchternaam(String persoonAchternaam)
    {
        achternaam = persoonAchternaam;
    }
    
    /**
     * Get achternaam
     */
    public String getAchternaam(){
        
        achternaamTemp = achternaam;
        return achternaamTemp;
    }
    
    /**
     * Set geboortedatum
     */
    public void setGeboortedatum(int persoonGeboortedatumDag, int persoonGeboortedatumMaand, int persoonGeboortedatumJaar)
    {
        geboortedatumDag = 0;
        geboortedatumMaand = 0;
        geboortedatumJaar = 0;
        
        if((persoonGeboortedatumDag >= 1) && 
           (persoonGeboortedatumMaand >= 1 && persoonGeboortedatumMaand <= 12) && 
           (persoonGeboortedatumJaar >= 1900 && persoonGeboortedatumJaar <= 2100))
        {
            switch (persoonGeboortedatumMaand){
                case 4:
                case 6:
                case 9:
                case 11:
                    if(persoonGeboortedatumDag <= 30){
                        System.out.println("Uw geboortedatum is aangepast naar " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar);
                        geboortedatumDag = persoonGeboortedatumDag;
                        geboortedatumMaand = persoonGeboortedatumMaand;
                        geboortedatumJaar = persoonGeboortedatumJaar;
                    } else {
                        System.out.println("De datum " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar + " is niet geldig!");
                    }
                break;
                
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if(persoonGeboortedatumDag <= 31){
                        System.out.println("Uw geboortedatum is aangepast naar " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar);
                        geboortedatumDag = persoonGeboortedatumDag;
                        geboortedatumMaand = persoonGeboortedatumMaand;
                        geboortedatumJaar = persoonGeboortedatumJaar;
                    } else {
                        System.out.println("De datum " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar + " is niet geldig!");
                    }
                break;
                
                case 2:
                    if((persoonGeboortedatumJaar % 4 == 0) && (persoonGeboortedatumJaar % 100 != 0) || (persoonGeboortedatumJaar % 400 == 0 )){
                        if(persoonGeboortedatumDag <= 29){
                           System.out.println("Uw geboortedatum is aangepast naar " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar);
                           geboortedatumDag = persoonGeboortedatumDag;
                           geboortedatumMaand = persoonGeboortedatumMaand;
                           geboortedatumJaar = persoonGeboortedatumJaar;
                        } else {
                           System.out.println("De datum " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar + " is niet geldig!"); 
                        }
                    } else {
                        if(persoonGeboortedatumDag <= 28){
                           System.out.println("Uw geboortedatum is aangepast naar " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar);
                           geboortedatumDag = persoonGeboortedatumDag;
                           geboortedatumMaand = persoonGeboortedatumMaand;
                           geboortedatumJaar = persoonGeboortedatumJaar;
                        } else {
                           System.out.println("De datum " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar + " is niet geldig!"); 
                        }
                    }
                break;
            }
        
        } else {
            System.out.println("De datum " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar + " is niet geldig!"); 
        }
    }
    
    /**
     * Get geboortedatum
     */
    public String getGeboortedatum(){
        
        if (geboortedatumDag == 0 && geboortedatumMaand == 0 && geboortedatumJaar == 0){
            geboortedatumTemp = "Onbekend";
        } else {
            geboortedatumTemp = geboortedatumDag+"/"+geboortedatumMaand+"/"+geboortedatumJaar;
        }
        
        return geboortedatumTemp;
    }
    
    /**
     * Set geslacht
     */
    public void setGeslacht(char persoonGeslacht)
    {
        if (persoonGeslacht == 'm' || persoonGeslacht == 'v'){
            geslacht = persoonGeslacht;
        } else {
            System.out.println ("U zult M of V in moeten vullen!");
            geslacht = '0';
        }   
    }
    
    /**
     * Get geslacht
     */
    public String getGeslacht()
    {
        geslachtTemp = "Onbekend";
        
        if (geslacht == 'm'){
            geslachtTemp = "Man";
        } 
        
        if (geslacht == 'v'){
            geslachtTemp = "Vrouw";
        }
        
        return geslachtTemp;
    }
    /**
     * Print de instantievariabelen van de klasse 'Persoon'
     */
    public void drukAf()
    {
        getBSN();
        System.out.println ("Burgerservicenummer: " + BSNTemp);
        
        getVoornaam();
        System.out.println ("Voornaam: " + voornaamTemp);
        
        getAchternaam();
        System.out.println ("Achternaam: " + achternaamTemp);
        
        getGeboortedatum();
        System.out.println ("Geboortedatum: "  + geboortedatumTemp);
        
        getGeslacht();
        System.out.println ("Geslacht: " + geslachtTemp); 
        
    }    



}
