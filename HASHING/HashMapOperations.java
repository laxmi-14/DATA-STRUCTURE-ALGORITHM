import java.util.*;

public class HashMapOperations {
    public static void main(String[] args) {
        //Create
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("US", 50);
        System.out.println(hm);

    //     //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

       System.out.println(hm.get("Indonesia"));  //when key not exist it return null

    //    //ContainsKey - O(1)
       System.out.println(hm.containsKey("India"));
       System.out.println(hm.containsKey("Indonesia"));

    //REMOVE - O(1)
    System.out.println(hm.remove("China"));
    System.out.println(hm);

    //SIZE
    System.out.println(hm.size());

    //IsEmpty
    hm.clear();
    System.out.println(hm.isEmpty());
       
    }
    
}