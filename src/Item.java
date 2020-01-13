
public abstract class Item {
   
    protected String name; //name of item
    protected String type; //retail or food
    protected double cost; //cost 
    protected int quant; //quanitity purchased
    
    
    
    //default constructor
    public Item(){
        name = "";
        cost = 0;
        quant = 0;
    }
    
    public Item(String n, double c, int q, String t){ 
        name = n;
        cost = c;
        quant = q;
        type = t;
    }
    
    //total is determined differently for each item
    public abstract double total();
    
    //will be overridden by some classes
    public  String toString(){
        String str = "Name: " + name + "\nType: " + type + "\nCost: $ " + cost + "\nQuantity: " + quant;
        str += "\n===================";
        return str;
    }
    
   
    
}
