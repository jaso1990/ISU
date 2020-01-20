
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Tester {

   
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String t = "black";
        System.out.println(t.length());
       boolean test = randomDecline();
        System.out.println(test);
        


    }
    
    public static boolean randomDecline(){
        int r = (int) (Math.random() *  10) + 1;
        System.out.println(r);
        if (r == 2)
            return true;
        else
            return false;
    }
  
    
}
