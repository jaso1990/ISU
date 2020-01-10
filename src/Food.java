
public abstract class Food extends Item{
    
    protected double totalFoodCost; //keeps track of money spent on food
    
    public Food(String n, double c, int q){
        super(n, c, q);
    }

    @Override
    public double total() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
