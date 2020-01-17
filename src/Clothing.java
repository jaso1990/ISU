
public class Clothing extends Item{
    
    private String size; //clothing will have a size (S, M, L, XL)
    
    //this constructor will include a size when creating object
    public Clothing(String n, double c, String t){
        super (n, c, t);
        
    }
    
    //medium is default size
    public Clothing(){
        super();
        size = "M";
    }

    @Override
    public double total() {
        subtotal = cost * quant; 
        return subtotal;
    }
    
    public boolean validateSize(String s){
        if (s.equals("s") || s.equals("m") ||s.equals("l") || s.equals("xl") || s.equals("S") || s.equals("M")|| s.equals("L") || s.equals("XL")){
            System.out.println(s);
            size = s;
            return true;
        }
        else
            return false;
    }
    
    
    public String getSize(){
        return size;
    }
    
    //overrides by adding size
    public String toString(){
        String str;
        str = "Name: " + name + "\nType: " + type + "\nCost: $ " + cost + "\nQuantity: " + quant  +  "\nSize: " + size + "\nSubtotal: $" + subtotal;
        str += "\n===================\n";
        return str;
    }

    
   
    
    
}
