
public class Debit extends Payment {
    
    private int PIN; //debit will require a pin code
    
    public Debit(double t){
        super(t);
    }
    
    public boolean validatePIN(int p){
        int count = 0;
        //loop will divide the number by 10 each time and add a count to number of digits
        //if count == 4, that means there are four digits, making the input a valid pin
        while(p > 0) {
            p = p / 10;
            count += 1; 
        }
        if (count == 4){
            PIN = p;
            return true;
        }
        else 
            return false;   
    }
}
