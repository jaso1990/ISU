
public class Produce extends Food{
    
    public Produce(String n, double c, String t){
        super(n, c, t);  
    }
    
    public Produce(String n){
        super(n);
        type = "Produce";
    }
    
    //dont pay tax on produce items
    public double total(){
        subtotal =  PROD_COST * quant;
        return subtotal;
    }
    
    //overrides item by using the final PROD_COST variable
    public String toString(){
        String str = "Name: " + name + "\nType: " + type + "\nCost: $ " + PROD_COST + "\nQuantity: " + quant + "\nSubtotal: $" + subtotal;
        str += "\n===================\n";
        return str;
    }
    
    
}
