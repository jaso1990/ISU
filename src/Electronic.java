
public class Electronic extends Retail{
    
    private int inch; //will determine size of the TV or Computer
    
    public Electronic (String n, double c, int q, int i){
        super (n, c, q);
        inch = i;
    }
    
    //electronics have a 15$ installation cost 
    public double total(){
        double total = (cost * quant * 1.13) + 15;
        return (cost * quant * 1.13) + 15;
    }
    
    
    
}
