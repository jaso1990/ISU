
public abstract class Item {
   
    protected String name; //name of item
    protected String type; //clothing, electronic or food
    protected double cost; //cost 
    protected int quant; //quanitity purchased
    
    
    
    //default constructor
    public Item(){
        name = "";
        cost = 0;
        quant = 0;
    }
    
    public Item(String n, double c, String t){ 
        name = n;
        cost = c;
        type = t;
        quant = 0;
    }
    
   
    //total is determined differently for each item
    public abstract double total();
    
    //will validate the quantity read in txt is valid to create item
     public boolean validateQuant(int q){
         if (q > 0 && q <= 100){
             quant = q;
             return true;  
         }
         else
             return false;
     }
    
    //will be overridden by some classes
    public  String toString(){
        String str = "Name: " + name + "\nType: " + type + "\nCost: $ " + cost + "\nQuantity: " + quant;
        str += "\n===================";
        return str;
    }
    
   
    
}
