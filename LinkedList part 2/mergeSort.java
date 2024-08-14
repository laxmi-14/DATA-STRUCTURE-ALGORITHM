import java.util.LinkedList;

public class mergeSort {
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

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }
    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2 != null){
                temp.next = head2;
                head2 = head2.next;
                temp= temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp= temp.next;
    }
        return mergedLL;
}

public void print() {
    if (head == null) {
        System.out.println("Linked List is empty");
        return;
    }
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + "-->");
        temp = temp.next;
    }
    System.out.println("null");
}


    public Node mergeSort(Node head){
        if(head == null || head.next == null){  //LinkedList already sorted
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left & right 
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        //merge
        return merge(newLeft,newRight);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        //5-->4-->3-->2-->1 reverse sorted
        ll.print();

        ll.head = ll.mergeSort(ll.head);
        ll.print();   
        //1-->2-->3-->4-->5 //sorted  
        
        //time compelexity = O(nlogn)
    }
}
