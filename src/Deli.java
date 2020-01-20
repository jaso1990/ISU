
public class Deli extends Food{
    
    //all deli items are 10 cents per gram  
    //OR 5 cents per gram when buying at least than 500 grams
    private final double DELI_COST = 0.10, DELI_DEAL = 0.05; 


    public Deli (String n, double c, String t){
        super(n, c, t);
    }
    
    public Deli(String n){
        super(n);
        type = "Deli";
    }
    
    
    //if < 500 grams, pay full price, else pay half price
    public double total(){
        if (quant < 500 )
            subtotal = (quant * DELI_COST) * 1.13;
        else 
            subtotal = (quant * DELI_DEAL) * 1.13;
            return subtotal;
    }
    
    
    public String toString(){
        //deli toString overrides parent by changing 'quantity' to 'weight'
        //will display a different cost depending on the quantity purchased 
        String str;
        if (quant < 500) 
            str = "Name: " + name + "\nType: " + type + "\nCost: $ " + DELI_COST + "\nWeight: " + quant  + "\nSubtotal: $" + subtotal;
        else
            str = "Name: " + name + "\nType: " + type + "\nCost: $ " + DELI_DEAL + "\nWeight: " + quant  + "\nSubtotal: $" + subtotal;
        str += "\n===================\n";
        return str;
    }
    
    //overrides validateQuant from item class
    public boolean validateQuant(int q){
        if (q > 0 && q <= 1000){
            quant = q;
            return true;
        }
        else 
            return false;
        
    }
}
