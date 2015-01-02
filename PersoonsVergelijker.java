public class PersoonsVergelijker
{

    public static void main(String[] args){
       Persoon persoon1 = new Persoon(2345434, "test", "test", 25, 9, 1997, 'm');
       Persoon persoon2 = new Persoon(2345434, "test", "test", 25, 9, 1997, 'm');
        
        System.out.println("persoon 1 == persoon2 geeft: " + (persoon1 == persoon2));

       System.out.println("persoon1.equals(persoon2) geeft: " + persoon1.equals(persoon2));
    }
}
