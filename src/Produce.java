
public class Produce extends Food{
    
    public Produce(String n, double c, int q){
        super(n, c, q);
    }
    
    //dont pay tax on produce items
    public double total(){
        double total =  cost * quant;
        return total;
    }
}
