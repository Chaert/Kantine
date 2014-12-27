/**
 * Daniel Boonstra & Tjeerd Feddema
 */
public class Persoon
{
    private int bsn;
    private String voornaam;
    private String achternaam;
    private int geboortedatumDag;
    private int geboortedatumMaand;
    private int geboortedatumJaar;
    private char geslacht;
    private Dienblad dienblad;

    /**
     * Lege constructor
     */
    public Persoon(){

    }

    /**
     * Constructor met ingevulde waarden
     * @param BSN, voornaam, achternaam, geboortedatum, geslacht van de aan te maken persoon
     */
    public Persoon(int bsn, String voornaam, String achternaam, int geboortedatumDag, int geboortedatumMaand, int geboortedatumJaar, char geslacht){
        setBsn(bsn);
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setGeboortedatum(geboortedatumDag, geboortedatumMaand, geboortedatumJaar);
        setGeslacht(geslacht);
    }

    /**
     * Sla de BSN van de gebruiker op
     * @param BSN
     */
    public void setBsn(int bsn)
    {
        this.bsn = bsn;
    }

    /**
     * Return de eventueel ingevoerde BSN
     * @return BSN
     */
    public String getBsn()
    {
        String temp;
        if(bsn == 0){
            temp = "Onbekend";
        }else{
            temp = "" + bsn + "";
        }
        return temp;
    }

    /**
     * Sla de voornaam van de gebruiker op
     * @param voornaam
     */
    public void setVoornaam(String voornaam)
    {
        this.voornaam = voornaam;
    }

    /**
     * Return de eventueel ingevoerde voornaam
     * @return voornaam
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
     * @param achternaam
     */
    public void setAchternaam(String achternaam)
    {
        this.achternaam = achternaam;
    }

    /**
     * Return de eventueel ingevoerde achternaam
     * @return achternaam
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
     * @param geboortedatumdag, maand en jaar
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
            //System.out.println("Uw geboortedatum is aangepast naar " + this.geboortedatumDag + "-" + this.geboortedatumMaand + "-" + this.geboortedatumJaar);
        } else {
            geboortedatumDag = 0;
            geboortedatumMaand = 0;
            geboortedatumJaar = 0;
            System.out.println("De datum " + geboortedatumDag + "-" + geboortedatumMaand + "-" + geboortedatumJaar + " is niet geldig!");
        }
    }

    /**
     * Return de eventueel ingevoerde geboortedatum
     * @return geboortedatum
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
     * @param geslacht
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
     * Return het eventueel ingevoerde geslacht
     * @return geslacht
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
     * Returnt alle instantievariabelen van de klasse 'Persoon' als string
     */
    public String toString()
    {
        return "Burgerservicenummer: " + getBsn() + "\n" +
               "Voornaam: " + getVoornaam() + "\n" +
               "Achternaam: " + getAchternaam() + "\n" +
               "Geboortedatum: "  + getGeboortedatum() + "\n" +
               "Geslacht: " + getGeslacht() + "\n\n";

    }   
    
    public void drukAf()
    {
        
    }

    /**
     * Methode om dienblad te koppelen aan een persoon
     * @param dienblad
     */
    public void pakDienblad(Dienblad dienblad) {
        this.dienblad = dienblad;
    }
    
    /**
     * Methode om het gekoppelde dienblad te retourneren
     * @return dienblad
     */
    public Dienblad getDienblad(){
        return dienblad;
    }

}
