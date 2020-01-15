
public class Debit extends Payment {
    
    private String PIN; //debit will require a pin code
    
    public Debit(double t){
        super(t);
    }
    
    //method will return true and set the PIN if it is 4 chars in length
    public boolean validatePIN(String p){
        int count = 0;
       if (p.length()==4){
           PIN = p;
            return true;
        }
        else 
            return false;   
    }
    
    //1 out of 10 times your card will decline and you will need to choose a new card
    public boolean randomDecline(){
        int r = (int) Math.random() * 10 + 1;
        if (r == 1)
            return true;
        else
            return false;
    }
}
