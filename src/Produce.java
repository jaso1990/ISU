
public class Produce extends Food{
    
    //all produce will be $2 per item
    private final double PROD_COST = 2.00;
    
    public Produce(String n, double c, String t){
        super(n, c, t);
        
    }
    
    public Produce(String n, String t, int q){
        
        
    }
    
    //dont pay tax on produce items
    public double total(){
        double total =  cost * quant;
        return total;
    }
    
    
}
