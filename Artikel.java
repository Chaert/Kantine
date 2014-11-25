/**
 * @Daniel Boonstra & Tjeerd Feddema
 */
public class Artikel
{
   public String naam;
   public double prijs;
   
   public String tempNaam;
   public double tempPrijs;
   
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
       tempNaam = naam;
       return tempNaam;
   }
   
   /**
    * Get de artikel prijs.
    */
   public double getPrijs(){
       tempPrijs = prijs;
       return tempPrijs;
   }
   
   /**
     * Print de instantievariabelen van de klasse 'Artikel'
     */
    public void drukAf()
   {
        getNaam();
        System.out.println("Naam: " + tempNaam);
        
        getPrijs();
        System.out.println("Prijs: €" + tempPrijs);
   }    
}
