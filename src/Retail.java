
public abstract class Retail extends Item{
    
    protected double totalRetailCost; //keeps track of money spent on retail
    
    public Retail (String n, double c, int q){
        super (n, c, q);
        
    }
    
    

    @Override
    public double total() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
