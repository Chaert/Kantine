public class Pinpas extends Betaalwijze {    
    private double kredietlimiet;

    /**     
     * Methode om kredietlimiet te zetten     
     * @param kredietlimiet     
     */     
    public void setKredietLimiet(double kredietlimiet) {     
        this.kredietlimiet = kredietlimiet;
    }

    /** 
     * Methode om betaling af te handelen     
     */    
    public void betaal(double tebetalen) throws TeWeinigGeldException
    {   
        if ((saldo + kredietlimiet) < tebetalen) {
            throw new TeWeinigGeldException("Onvoldoende saldo op de rekening.");            
        } else {
            saldo -= tebetalen;
        }
        //return ((tebetalen <= saldo) && (tebetalen <= kredietlimiet));  
    } 
}
