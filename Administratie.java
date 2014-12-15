import java.util.*;

public class Administratie {
    
    public static final int DAYS_IN_WEEK = 6;
    
    /**
     * Private constructor die verder niks doet
     */
    private Administratie(){
        
    }
    
    /**
     * Methode om dagomzet uit te rekenen
     * @param omzet
     * @return array (DAYS_IN_WEEK elementen) met dagomzetten
     */
    public static double[] berekenDagOmzet(double[] omzet){
        double[] temp = new double[DAYS_IN_WEEK];
        for(int i=0; i<DAYS_IN_WEEK; i++){
            int j=0;
            while(i+j*DAYS_IN_WEEK < omzet.length){
                temp[i] += omzet[i+DAYS_IN_WEEK*j];
                j++;
            }
        }
        return temp;
    }
    
    /**
     * Deze methode berekent van de int array aantal de 
     * gemiddelde waarde
     * @param aantal
     * @return het gemiddelde
     */
    public static double berekenGemiddeldAantal(int[] aantal) {
        if(aantal.length > 0){
            double totaal = 0.0;
            for(int i = 0; i < aantal.length; i++){
                double hoeveel = aantal[i];
                totaal += hoeveel;
            }
            double gemiddeld = totaal / aantal.length;
            return gemiddeld;
        }
        return 0;
    }

    /**
     * Deze methode berekent van de double array omzet de 
     * gemiddelde waarde
     * @param omzet
     * @return Het gemiddelde
     */
    public static double berekenGemiddeldeOmzet(double[] omzet) {
        if(omzet.length > 0){
            double totaal = 0;
            for(int i = 0; i < omzet.length; i++){
                totaal += omzet[i];
            }
            double gemiddeld = totaal / omzet.length;
            return gemiddeld;
        }
        return 0;
    }
}
