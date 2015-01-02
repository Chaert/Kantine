public class KantineMedewerker extends Persoon implements KortingskaartHouder
{
    private int medewerkersNummer;
    private boolean magAchterKassa;

    public KantineMedewerker(int medewerkersNummer, boolean magAchterkassa, int bsn, String voornaam, String achternaam, int geboortedatumDag, int geboortedatumMaand, int geboortedatumJaar, char geslacht)
    {
        super(bsn, voornaam, achternaam, geboortedatumDag, geboortedatumMaand, geboortedatumJaar, geslacht);
        setMedewerkersNummer(medewerkersNummer);
        setMagAchterKassa(magAchterKassa);
    }

     /**
     * Set de ingevoerde medewerkersnummer
     * @param medewerkersnummer
     */
    public void setMedewerkersNummer(int medewerkersNummer)
    {
        this.medewerkersNummer = medewerkersNummer;
    }
    
    /**
     * Set of de medewerker achter de kassa mag
     * @param mag achter kassa
     */
    public void setMagAchterKassa(boolean magAchterKassa)
    {
        this.magAchterKassa = magAchterKassa;
    }
    
    /**
     * Return de eventueel ingevoerde medewerkersnummer
     * @return medewerkersnummer
     */
    public String getMedewerkersNummer()
    {
        String temp;
        if(medewerkersNummer == 0){
            temp = "Onbekend";
        }else{
            temp = "" + medewerkersNummer + "";
        }
        return temp;
    }
    
    /**
     * Return het of deze persoon achter de kassa mag
     * @return ja of nee
     */
    public String getMagAchterKassa()
    {
        String temp;
        temp = "Onbekend";
        if (magAchterKassa == true){
            temp = "Ja";
        } 

        if (magAchterKassa == false){
            temp = "Nee";
        }
        return temp;
    }
    
    /**
     * Print de overige instantievariabelen van de klasse 'KantineMedewerker'
     */
    public void drukAf()
    {
        System.out.println ("----|Katine Medewerker|----");
        System.out.println ("Medewerkersnummer: " + getMedewerkersNummer());
        System.out.println ("Mag deze persoon achter de kassa: " + getMagAchterKassa());
        System.out.print(super.toString());
    }  
    
    // methode om kortingspercentage op te vragen    
    public double geefKortingsPercentage(){
        return 0.35;
    }
    
    // methode om op te vragen of er maximum per keer aan de korting zit    
    public boolean heeftMaximum(){
        return false;
    }
    
    // methode om het maximum kortingsbedrag op te vragen   
    public double geefMaximum(){
        return 0.00;
    }
}