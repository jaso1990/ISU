
public abstract class Item {
   
    protected String name; //name of item
    protected double cost; //cost 
    protected int quant; //quanitity purchased
    
    protected double totalRetailCost; //keeps track of money spent on retail
    
    //default constructor
    public Item(){
        name = "";
        cost = 0;
        quant = 0;
    }
    
    public Item(String n, double c, int q){ 
        name = n;
        cost = c;
        quant = q;
    }
    
    //total is determined differently for each item
    public abstract double total();
    
    public  String toString(){
        String str = "Name: " + name + "\nCost: $ " + cost + "\nQuantity: " + quant;
        return str;
    }
    
   
    
}
