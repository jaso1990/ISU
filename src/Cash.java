
public class Cash extends Payment {
    
    private double change; //will recieve change when paying in cash
    
    public Cash(double t) {
        super(t);
    }
    
    //makes sure tendered cash is enough to pay for groceries
    public boolean validateTender(double t){
        if (t >= total){
            change = t;
            return true;
        }
        else
            return false;
    }
    
    //sets the amount of change you recieve
    public void setChange(double tot, double tend){
        change = tot - tend;
    }
       
    //getter
    public double getChange(){
        return change;
    }
    
}
