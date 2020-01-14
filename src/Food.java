
public abstract class Food extends Item{
    
    
    
    public Food(String n, double c,  String t){
        super(n, c, t);
    }
    
    public Food(){
        
    }

    @Override
    public double total() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
