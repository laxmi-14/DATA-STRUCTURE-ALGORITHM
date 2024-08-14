

public class linkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
            if(head == null){
                Node newNode = new Node(data);
                head = tail = null;
                return;
            }
            //step 1 : Create a new Node
            Node newNode = new Node(data);
            //step 2 : newNode next = head
            newNode.next = head;
            //step 3 : head = newNode
            head = newNode;
        }
        public void addLast(int data){
            if(head==null){
                Node newNode = new Node(data);
                head = tail = newNode;
                return;
            }
            Node newNode = new Node(data);
            tail.next = newNode;
            newNode = tail.next;
        }
        public static boolean isCycle() {
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;  //cycle exist
                }
            }
            return false;  //cycle doesn't exist
        }

        
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;  //1->2->3->2
        System.out.println(isCycle());

      
        
    }
    
}
