
public class Deli extends Food{
    
    public Deli (String n, double c, int q){
        super(n, c, q);
    }
    
    
    //total for deli is based on a fixed price of 5$ for 100g (5 cents / gram)
    public double total(){
        double total = (quant * 0.05) * 1.13;
        totalFoodCost += total;
        return total;
    }
}
