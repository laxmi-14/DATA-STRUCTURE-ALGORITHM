import java.util.ArrayList;
public class Contains {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

             //Contains -O(n)
        System.out.println(list.contains(1));
      System.out.println(list.contains(11));
    }
    
}
