
import javax.swing.JOptionPane;


public class Electronic extends Retail{
    
    private int inch; //will determine size of the TV or Computer
    
    public Electronic (String n, double c, String t){
        super (n, c, t);
    }
    
    //electronics have a cost of $10 per inch of screen
    public Electronic (String n, String t){
        super (n ,t);
        cost = 10;
    }
    
    //electronics have a 15$ installation cost
    //also cost is 10$ per inch of screen
    public double total(){
        subtotal = ((cost * inch) * quant + 15) * 1.13;
        return subtotal;
    }
    
    //upon buying an electrronic, user will get JOption ANY custom size between 30 - 100 inches
    //JOption will only go away once setInch returns true
    public boolean validateInch(int input){
        if (input >= 30 && input <=100 ){
            inch = input;
            return true;
        }
        else
            return false;     
    }
    
    public int getInch(){
        return inch;
    }
    
    public String toString(){
        String str;
        str = "Name: " + name + "\nType: " + type + "\nCost: $ " + cost + "\nQuantity: " + quant  +  "\nSize: " + inch + "\nSubtotal: $" + subtotal;
        str += "\n===================\n";
        return str;
    }
           
       
    
    
    
    
}
