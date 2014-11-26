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
     public String getBSN()
     {
         String temp;
         if(BSN == 0)
         {
             temp = "Onbekend";
         } 
         else 
         {
             temp = "" + BSN + "";
         }
         return temp;
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
        String temp;
        if(voornaam == null){
            temp = "Onbekend";
        } else {
            temp = voornaam;
        }
        return temp;
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
        String temp;
        if(achternaam == null){
            temp = "Onbekend";
        } else {
            temp = achternaam;
        }
        return temp;
    }
    
    /**
     * Set geboortedatum
     */
    public void setGeboortedatum(int persoonGeboortedatumDag, int persoonGeboortedatumMaand, int persoonGeboortedatumJaar)
    {
        boolean check = false;
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
                        check = true;
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
                        check = true;
                    } else {
                        System.out.println("De datum " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar + " is niet geldig!");
                    }
                break;
                
                case 2:
                    if((persoonGeboortedatumJaar % 4 == 0) && (persoonGeboortedatumJaar % 100 != 0) || (persoonGeboortedatumJaar % 400 == 0 )){
                        if(persoonGeboortedatumDag <= 29){
                           System.out.println("Uw geboortedatum is aangepast naar " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar);
                           check = true;
                        } else {
                           System.out.println("De datum " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar + " is niet geldig!"); 
                        }
                    } else {
                        if(persoonGeboortedatumDag <= 28){
                           System.out.println("Uw geboortedatum is aangepast naar " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar);
                           check = true;
                        } else {
                           System.out.println("De datum " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar + " is niet geldig!"); 
                        }
                    }
                break;
            }
        
        } else {
            System.out.println("De datum " + persoonGeboortedatumDag + "-" + persoonGeboortedatumMaand + "-" + persoonGeboortedatumJaar + " is niet geldig!"); 
        }
        
        if(check){
            geboortedatumDag = persoonGeboortedatumDag;
            geboortedatumMaand = persoonGeboortedatumMaand;
            geboortedatumJaar = persoonGeboortedatumJaar;
        }
    }
    
    /**
     * Get geboortedatum
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
     * Print de instantievariabelen van de klasse 'Persoon'
     */
    public void drukAf()
    {
        getBSN();
        System.out.println ("Burgerservicenummer: " + getBSN());
        
        getVoornaam();
        System.out.println ("Voornaam: " + getVoornaam());
        
        getAchternaam();
        System.out.println ("Achternaam: " + getAchternaam());
        
        getGeboortedatum();
        System.out.println ("Geboortedatum: "  + getGeboortedatum());
        
        getGeslacht();
        System.out.println ("Geslacht: " + getGeslacht()); 
        
    }    



}
