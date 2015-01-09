public class Contant extends Betaalwijze {    
    /**     
     * Methode om betaling af te handelen     
     */     
    public void betaal(double tebetalen)throws TeWeinigGeldException 
    {	
        if (saldo < tebetalen) {
            throw new TeWeinigGeldException("Uw saldo is te laag");
            
        }    
        //return (tebetalen <= saldo);
    }
}

