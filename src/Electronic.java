
public class Electronic extends Item{
    
    private int inch; //will determine size of the TV or Computer
    
    public Electronic (String n, double c, int q, int i){
        super (n, c, q);
        inch = i;
    }
    
    
    public Electronic (){
        super();
        inch = 30; //standard size
    }
    //electronics have a 15$ installation cost 
    public double total(){
        return (cost * quant * 1.13) + 15;
    }
    
    
    
}
