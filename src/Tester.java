
import java.util.ArrayList;
import java.util.Scanner;


public class Tester {

   
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        ArrayList <Item> list = new ArrayList();
        Item apple = new Produce ("Apple", 5, 3);
        list.add(apple);
        System.out.println(apple.toString());
    
        Item tv = new Electronic ("TV", 200, 1);
        list.add(tv);
        
        double cost = 0;
        for (Item item : list) {
            cost += item.total();
        }
        
        System.out.format("%.2f\n", tv.total());
        System.out.println(apple.total());
        System.out.println(cost);
        
    }
    
}
