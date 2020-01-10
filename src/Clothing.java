
public class Clothing extends Item{
    
    private String size; //clothing will have a size (S, M, L, XL)
    
    public Clothing(String n, double c, int q, String s ){
        super (n, c, q);
        size = s;
    }
    
    public Clothing(){
        super();
        size = "M";
    }

    @Override
    public double total() {
        double total = cost * quant;
        totalRetailCost += total;
        return total;
    }
    
    
    
}
