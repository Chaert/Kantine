import java.util.*;

public class Dienblad {
    private Stack<Artikel> artikelen;

    /**
     * Constructor
     */
    public Dienblad() {
        artikelen = new Stack<Artikel>(); 
    }
 
    /**
     * Methode om artikel aan dienblad toe te voegen
     * @param artikel
     */
    public void voegToe(Artikel artikel) {
        artikelen.add(artikel);
    }
    
    /**
     * Iterate alle artikelen op het dienblad
     * @return Iterator van artikelen
     */
    public Iterator<Artikel> geefIterator() {
        Iterator<Artikel> iterator = artikelen.iterator();
        return iterator;
    }

}
