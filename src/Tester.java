
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Tester {

   
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int count = 0;
       int p = 0100;
        //loop will divide the number by 10 each time and add a count to number of digits
        //if count == 4, that means there are four digits, making the input a valid pin
        while(p > 0) {
            p = p / 10;
            count += 1; 
        }
        
        System.out.println(count);
        


    }
  
    
}
