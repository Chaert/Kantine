/**
 * @Daniel Boonstra & Tjeerd Feddema
 */
public class Artikel
{
    public String naam;
    public double prijs;

    /**
     * Lege constructor
     */
    public Artikel(){

    }

    /**
     * Constructor met ingevoerde waarden
     * @param artikelnaam, artikelprijs
     */
    public Artikel(String naam, double prijs)
    {
        setNaam(naam);
        setPrijs(prijs);
    }

    /**
     * Set de artikel naam.
     * @param artikelnaam
     */
    public void setNaam(String naam){
        this.naam = naam;
    }

    /**
     * Set de artikel prijs.
     * @param prijs
     */
    public void setPrijs(double prijs){
        this.prijs = prijs;
    }

    /**
     * Get de artikel naam.
     * @return naam
     */
    public String getNaam(){
        String temp;
        if(naam == null){
            temp = "Onbekend";
        } else {
            temp = naam;
        }
        return temp;
    }

    /**
     * Get de artikel prijs inclusief euroteken, als string
     * @return prijs
     */
    public String getPrijs(){
        String temp;
        if(prijs == 0.0){
            temp = "Onbekend";
        } else {
            temp = "€" + prijs;
        }
        return temp;
    }

    /**
     * Get de artikel prijs, als int
     * @return prijs
     */
    public double getPlainPrijs(){
        return prijs;
    }

    /**
     * Print de instantievariabelen van de klasse 'Artikel'
     */
    public void drukAf()
    {
        System.out.println("Naam: " + getNaam());
        System.out.println("Prijs: " + getPrijs());
    }    
}
