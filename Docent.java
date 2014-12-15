public class Docent extends Persoon
{
    private String afkorting;
    private String afdeling;
    
    public Docent(String afkorting, String afdeling, int bsn, String voornaam, String achternaam, int geboortedatumDag, int geboortedatumMaand, int geboortedatumJaar, char geslacht)
    {
        super(bsn, voornaam, achternaam, geboortedatumDag, geboortedatumMaand, geboortedatumJaar, geslacht);
        setAfkorting(afkorting);
        setAfdeling(afdeling);
    }
    
     /**
     * Set de ingevoerde afkorting
     * @param afkorting
     */
    public void setAfkorting(String afkorting)
    {
        if(afkorting.length() == 4){
            this.afkorting = afkorting;
        } else {
            System.out.println("U zult een 4 lettercode in moeten voeren");
        }
    }
    
    /**
     * Set de ingevoerde afdeling
     * @param afdeling
     */
    public void setAfdeling(String afdeling)
    {
        this.afdeling = afdeling;
    }
    
    /**
     * Return de eventueel ingevoerde afkorting
     * @return afkorting
     */
    public String getAfkorting()
    {
        String temp;
        if(afkorting == null){
            temp = "Onbekend";
        }else{
            temp = "" + afkorting + "";
        }
        return temp;
    }
    
    /**
     * Return de eventueel ingevoerde afdeling
     * @return afdeling
     */
    public String getAfdeling()
    {
        String temp;
        if(afdeling == null){
            temp = "Onbekend";
        }else{
            temp = "" + afdeling + "";
        }
        return temp;
    }
    
    /**
     * Print de overige instantievariabelen van de klasse 'Docent'
     */
    public void drukAf()
    {
        System.out.println ("Afkorting: " + getAfkorting());
        System.out.println ("Afdeling: " + getAfdeling());

    }    
}