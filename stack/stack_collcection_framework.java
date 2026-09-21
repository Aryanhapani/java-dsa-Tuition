import java.util.Stack;
public class stack_collcection_framework {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);
        int n=stack1.size()/2;
        
        Stack<Integer> stack2=new Stack<>();
        for(int i=1;i<=n;i++){
            int popval=stack1.pop();
            stack2.push(popval);
        }
        stack1.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        System.out.println(stack1);
        
    }
}
