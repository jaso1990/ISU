
public abstract class Food extends Item{
    
    
    
    public Food(String n, double c, int q, String t){
        super(n, c, q, t);
    }

    @Override
    public double total() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
