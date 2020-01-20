
public class Custom extends Item{
    
    public Custom(String n, double c, String t){
        super(n, c, t);
    }

    public double total() {
        subtotal =  (cost * quant) * 1.13;
        return subtotal;
    }
 
}
