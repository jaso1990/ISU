
public class Clothing extends Item{
    
    private String size; //clothing will have a size (S, M, L, XL)
    
    //this constructor will include a size when creating object
    public Clothing(String n, double c, String t, String s){
        super (n, c, t);
        size = s;
    }
    
    public Clothing(){
        super();
        size = "M";
    }

    @Override
    public double total() {
        double total = cost * quant;
        
        return total;
    }

    
    public int validateQuant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
