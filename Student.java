public class Student extends Persoon
{
    private int studentNummer;
    private String studieRichting;
    
    public Student(int studentNummer, String studieRichting, int bsn, String voornaam, String achternaam, int geboortedatumDag, int geboortedatumMaand, int geboortedatumJaar, char geslacht)
    {
        super(bsn, voornaam, achternaam, geboortedatumDag, geboortedatumMaand, geboortedatumJaar, geslacht);
        setStudentNummer(studentNummer);
        setStudieRichting(studieRichting);
    }
    
    /**
     * Set de ingevoerde studentnummer
     * @param studentnummer
     */
    public void setStudentNummer(int studentNummer)
    {
        this.studentNummer = studentNummer;
    }
    
    /**
     * Set de ingevoerde studierichting
     * @param studierichting
     */
    public void setStudieRichting(String studieRichting)
    {
        this.studieRichting = studieRichting;
    }
    
    /**
     * Return de eventueel ingevoerde studentnummer
     * @return studentnummer
     */
    public String getStudentNummer()
    {
        String temp;
        if(studentNummer == 0){
            temp = "Onbekend";
        }else{
            temp = "" + studentNummer + "";
        }
        return temp;
    }
    
    /**
     * Return de eventueel ingevoerde studierichting
     * @return studierichting
     */
    public String getStudieRichting()
    {
        String temp;
        if(studieRichting == null){
            temp = "Onbekend";
        }else{
            temp = "" + studieRichting + "";
        }
        return temp;
    }
    
    /**
     * Print de overige instantievariabelen van de klasse 'Kantine'
     */
    public void drukAf()
    {
        System.out.println ("----|Student|----");
        System.out.println ("Afkorting: " + getStudentNummer());
        System.out.println ("Afdeling: " + getStudieRichting());
        System.out.print(super.toString());
    }    
}
