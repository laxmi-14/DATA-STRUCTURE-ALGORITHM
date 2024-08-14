
import java.util.ArrayList;

public class InsertHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){ //O(logn)
            //add at last index
            arr.add(data);

            int x = arr.size()-1;  //x is child index
            int par = x-1/2;   //parent index

            while(arr.get(x) < arr.get(par)){  //O(logn)
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        //PEEK FROM HEAP
        public int peek() {
            return arr.get(0);
        }
    }
    public static void main(String[] args) {
        
    }
    
}
