
import java.util.LinkedList;
import java.util.Queue;


//Queue using java collection framework
public class QueueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
    //    Queue<Intger> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        
    }
    
}
