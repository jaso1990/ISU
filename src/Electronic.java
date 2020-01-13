
import javax.swing.JOptionPane;


public class Electronic extends Retail{
    
    private String inch; //will determine size of the TV or Computer
    
    public Electronic (String n, double c, String t){
        super (n, c, t);
    }
    
    //electronics have a 15$ installation cost 
    public double total(){
        double total = (cost * quant * 1.13) + 15;
        return (cost * quant * 1.13) + 15;
    }
    
    //upon buying an electrronic, user will get JOption to choose a size
    //JOption will only go away once setInch returns true
    public boolean setInch(String input){
        if (input == "30" || input == "40"|| input == "50" ){
            inch = input;
            return true;
        }
        else
            return false;     
    }
    
    public String getInch(){
        return inch;
    }
           
       
    
    
    
    
}
