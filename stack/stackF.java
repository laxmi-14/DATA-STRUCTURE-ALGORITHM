import java.util.Stack;
public class stackF {
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        //next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = arr.length;
            }
            //3. push
            s.push(i);
        }
        //next smaller left

        s = new Stack<>();
        for(int i = 0;  i < arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            //3. push
            s.push(i);
        }
        //current area : width=j-i-1 = nsr[i] - nsr[i] - 1
        for(int i = 0; i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea,currArea);
        }
        System.out.println("The max area of histogram is:" + maxArea);

    }
    public static void main(String[] args) {
        int arr[] = {2,4};
        maxArea(arr);
        
    }
}
