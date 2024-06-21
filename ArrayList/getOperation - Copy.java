import java.util.ArrayList;
public class getOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

      
       // Get Operation - O(1)
        int element = list.get(2);
        System.out.println(element);

        
    }
    
}
