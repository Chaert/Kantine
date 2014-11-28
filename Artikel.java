/**
 * @Daniel Boonstra & Tjeerd Feddema
 */
public class Artikel
{
   public String naam;
   public double prijs;
   
   public Artikel(){
   
   }
   
   public Artikel(String artikelNaam, double artikelPrijs)
   {
       setNaam(artikelNaam);
       setPrijs(artikelPrijs);
   }
   
   /**
    * Set de artikel naam.
    */
   public void setNaam(String naam){
       this.naam = naam;
   }
   
   /**
    * Set de artikel prijs.
    */
   public void setPrijs(double prijs){
       this.prijs = prijs;
   }
   
   /**
    * Get de artikel naam.
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
    * Get de artikel prijs.
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
     * Print de instantievariabelen van de klasse 'Artikel'
     */
    public void drukAf()
   {
        System.out.println("Naam: " + getNaam());
        System.out.println("Prijs: " + getPrijs());
   }    
}
