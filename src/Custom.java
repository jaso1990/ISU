
public class Custom extends Item{
    
    //same constructor as item
    public Custom(String n, double c, String t){
        super(n, c, t);
    }

    //custom item total
    public double total() {
        subtotal =  (cost * quant) * 1.13;
        return subtotal;
    }
 
}
