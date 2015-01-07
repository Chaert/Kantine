import java.util.*;
import java.text.*;

public class KantineSimulatie {
    // kantine
    private Kantine kantine;

    // kantineaanbod
    private KantineAanbod kantineaanbod;

    // random generator
    private Random random;

    // afronden
    private NumberFormat round = new DecimalFormat("#.00");

    // aantal artikelen
    private static final int AANTAL_ARTIKELEN=4;

    // artikelen
    private static final String[] artikelnamen=
        new String[] {"Koffie", "Broodje hamburger", "Broodje kaas", "Melk"};

    // prijzen
    private static double[] artikelprijzen=
        new double[]{1.50, 2.10, 1.65, 1.65};   

    // minimum en maximum aantal artikelen per soort
    private static final int MIN_ARTIKELEN_PER_SOORT=10000;
    private static final int MAX_ARTIKELEN_PER_SOORT=20000;

    // minimum en maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG=50;
    private static final int MAX_PERSONEN_PER_DAG=150;

    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON=1;
    private static final int MAX_ARTIKELEN_PER_PERSOON=4;

    /**
     * Constructor
     */
    public KantineSimulatie(){
        kantine=new Kantine();
        random=new Random();
        int[] hoeveelheden=getRandomArray(AANTAL_ARTIKELEN,MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);
        kantineaanbod=new KantineAanbod(artikelnamen, artikelprijzen, hoeveelheden); 
        kantine.setKantineAanbod(kantineaanbod);
    }

    /**
     * Methode om een peroon aan te maken op een bepaalde kans
     */
    private void makeRandomPerson(){
        int kans = getRandomValue(1, 100);
        Persoon persoon;
        
        if(kans == 1){
            persoon = new KantineMedewerker(1, true, 328109, "Tjeerd", "Feddema", 25, 9, 1997, 'm');
        } else if(kans >= 2 && kans <= 11){
            persoon = new Docent("TEST", "Instituut voor ICT", 328109, "Daniel", "Boonstra", 25, 9, 1997, 'm');
        } else {
            persoon = new Student(1, "Informatica", 328109, "Daniel", "Boonstra", 25, 9, 1997, 'm');
        }

        kantine.loopPakSluitAan(persoon, maakArtikelArray());
        persoon.drukAf();
    }

    /**
     * Methode om een array van random getallen liggend tussen min en max 
     * van de gegeven lengte te genereren
     * @param lengte
     * @param min
     * @param max
     * @return De array met random getallen
     */
    private int[] getRandomArray(int lengte, int min, int max) {
        int[] temp=new int[lengte];
        for(int i=0;i<lengte;i++) {
            temp[i]=getRandomValue(min, max);
        }
        return temp;
    }

    /**
     * Methode om een random getal tussen min(incl) en 
     * max(incl) te genereren.
     * @param min
     * @param max
     * @return Een random getal
     */
    private int getRandomValue(int min, int max) {
        return random.nextInt(max-min+1)+min;
    }

    /**
     * Methode om op basis van een array van indexen voor de array 
     * artikelnamen de bijhorende array van artikelnamen te maken
     * @param indexen
     * @return De array met artikelnamen
     */
    private String[] geefArtikelNamen(int[] indexen) {
        String[] artikelen=new String[indexen.length];
        for(int i=0;i<indexen.length;i++) { 
            artikelen[i]=artikelnamen[indexen[i]];
        }
        return artikelen;
    }

    /**
     * Deze methode maakt een array met artikelen aan
     * @return Array met artikelen
     */
    private String[] maakArtikelArray(){                
        // bedenk hoeveel artikelen worden gepakt
        int aantalartikelen = getRandomValue(MIN_ARTIKELEN_PER_PERSOON, MAX_ARTIKELEN_PER_PERSOON);

        // genereer de “artikelnummers”, dit zijn indexen 
        // van de artikelnamen array  
        int[] tepakken=getRandomArray(aantalartikelen, 0, AANTAL_ARTIKELEN-1);

        // vind de artikelnamen op basis van 
        // de indexen hierboven
        String[] artikelen=geefArtikelNamen(tepakken);

        return artikelen;
    }

    /**
     * Deze methode simuleert een aantal dagen in het 
     * verloop van de kantine
     * @param dagen
     */
    public void simuleer(int dagen) {
        int[] aantalArray = new int[dagen];
        double[] omzetArray = new double[dagen];
        // for lus voor dagen
        for(int i=0;i<dagen;i++) {
            // bedenk hoeveel personen vandaag binnen lopen

            int aantalPersonen = getRandomValue(MIN_PERSONEN_PER_DAG, MAX_PERSONEN_PER_DAG);

            // laat de personen maar komen...
            // Eerst de studenten
            for(int l=1; l<=aantalPersonen; l++){
                // loop de kantine binnen, pak de gewenste 
                // artikelen, sluit aan
                makeRandomPerson();
            }

            // verwerk rij voor de kassa
            // druk de dagtotalen af en hoeveel personen binnen 
            // zijn gekomen
            // reset de kassa voor de volgende dag
            // en check de voorraad
            kantine.verwerkRijVoorKassa();
            double dagTotaal = kantine.getKassa().hoeveelheidGeldInKassa();
            int aantalArtikelen = kantine.getKassa().aantalArtikelen();
            kantineaanbod.checkVoorraad();
            int dag = i+1;

            System.out.println("Dag " + dag + ": Er zit  €" + round.format(dagTotaal) + " in de kassa. Totaal zijn er " + aantalArtikelen + " artikelen verkocht. Er zijn vandaag " + aantalPersonen + " klanten geweest.");
            omzetArray[i] = dagTotaal;
            aantalArray[i] = aantalArtikelen;
            kantine.getKassa().resetKassa();
        }

        // Laat de administratie relevante berekeningen uitvoeren
        double[] dagOmzet = Administratie.berekenDagOmzet(omzetArray);

        System.out.println("----------| Administratie |----------");
        for(int i = 0; i < dagOmzet.length; i++){
            String bedrag;
            if(dagOmzet[i] == 0){
                bedrag = "Niet gesimuleerd!";
            } else {
                bedrag = "€" + round.format(dagOmzet[i]);
            }

            System.out.println("- Dag " + (i+1) + " van de week: " + bedrag);
        }

        System.out.println("-");
        System.out.println("- Gemiddelde omzet: " + round.format(Administratie.berekenGemiddeldeOmzet(omzetArray)));
        System.out.println("- Gemiddeld aantal artikelen: " + round.format(Administratie.berekenGemiddeldAantal(aantalArray)));
        System.out.println("-------------------------------------");

    }
}

