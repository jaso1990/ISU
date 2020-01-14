
public abstract class Food extends Item{
    
    //all produce will be $2 per item
    protected final double PROD_COST = 2.00;
    //all deli items are 10 cents per gram  
    //OR 5 cents per gram when buying at least than 500 grams
    protected final double DELI_COST = 0.10, DELI_DEAL = 0.05; 
    
    public Food(String n, double c,  String t){
        super(n, c, t);
    }
    
    //constructor not needing cost (used in produce & deli)
    public Food (String n){
        name = n;
    }

    @Override
    public double total() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
}
