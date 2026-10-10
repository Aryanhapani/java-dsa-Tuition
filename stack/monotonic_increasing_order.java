import java.util.Stack;

public class monotonic_increasing_order {
    public static void main(String[] args) {
        int[] arr={1, 7, 9, 5};
        //monotonic increasing order stack
        Stack<Integer>  s1=new Stack<>();
        s1.push(arr[0]);

        for(int i=1;i<arr.length;i++){
            if (s1.peek() < arr[i]) {
                s1.push(arr[i]);
                
            }else{

                while (!s1.isEmpty() && s1.peek() > arr[i]) {
                    s1.pop();
                }

                s1.push(arr[i]);
            }
        }

        System.out.println(s1);
    }
}
