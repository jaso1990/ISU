
public class Deli extends Food{
    
    public Deli (String n, double c, String t){
        super(n, c, t);
    }
    
    
    //total for deli is based on a fixed price of 5$ for 100g (5 cents / gram)
    public double total(){
        double total = (quant * 0.05) * 1.13;
        return total;
    }
    
    //deli toString overrides parent by changing 'quantity' to 'weight'
    public String toString(){
        String str = "Name: " + name + "\nType: " + type + "\nCost: $ " + cost + "\nWeight: " + quant;
        str += "\n===================";
        return str;
    }
}
