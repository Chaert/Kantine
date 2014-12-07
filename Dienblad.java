import java.util.Stack;

public class Dienblad {
    public Stack<Artikel> artikelen;

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

}
