import java.util.*;
public class setElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        
        //Set element at index - O(n)
        list.set(2,10);
       System.out.println(list);
       
       
       
    }
}
