import java.util.*;

//Next Greater Element --> Ist time
public class nextGreater {
    public static void main(String[] args) {
        int arr[] ={5,7,1,0,2};
        Stack<Integer> s = new Stack<Integer>();
        int nxtGreater[] = new int[arr.length];
        
        for(int i = arr.length-1; i>=0;i--){
        //1. while
        while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
            s.pop();
        }
        //2. if-else
        if(s.isEmpty()){
            nxtGreater[i] = -1;
        }else{
            nxtGreater[i] = arr[s.peek()];
        }
        //3. push
        s.push(i);
    }
    for(int i = 0;i<nxtGreater.length;i++){
        System.out.print(nxtGreater[i] +" ");
    }
    System.out.println();
}
}
//4 DIFFERENT FORMS--
//NEXT GREATER RIGHT --> ANALYZED
//NEXT GREATER LEFT --> CHANGE LOOP IN ABOVE WRITTEN CODE 
//NEXT SMALLEST RIGHT --> REVERSE WHILE CONDITION --> <= TO >==
//NEXT SMALLER LEFT --> REVERSE LOOP AND CONDITION BOTH
