
public abstract class Retail extends Item{
    
    
    public Retail (String n, double c, String t){
        super (n, c, t);
        
    }
    
    //used in electronic
    public Retail (String n, String t){
        name = n;
        type = t;
    }
    
    @Override
    public double total() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
