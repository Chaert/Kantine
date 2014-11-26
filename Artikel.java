/**
 * @Daniel Boonstra & Tjeerd Feddema
 */
public class Artikel
{
   public String naam;
   public double prijs;
   
   public Artikel(String artikelNaam, double artikelPrijs)
   {
       naam = artikelNaam;
       prijs = artikelPrijs;
   }
   
   /**
    * Set de artikel naam.
    */
   public void setNaam(String artikelNaam){
       naam = artikelNaam;
   }
   
   /**
    * Set de artikel prijs.
    */
   public void setPrijs(double artikelPrijs){
       prijs = artikelPrijs;
   }
   
   /**
    * Get de artikel naam.
    */
   public String getNaam(){
       return naam;
   }
   
   /**
    * Get de artikel prijs.
    */
   public double getPrijs(){
       return prijs;
   }
   
   /**
     * Print de instantievariabelen van de klasse 'Artikel'
     */
    public void drukAf()
   {
        System.out.println("Naam: " + naam);
        System.out.println("Prijs: €" + prijs);
   }    
}
