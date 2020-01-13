
public class Produce extends Food{
    
    public Produce(String n, double c, int q, String t){
        super(n, c, q, t);
    }
    
    //dont pay tax on produce items
    public double total(){
        double total =  cost * quant;
        return total;
    }
}
