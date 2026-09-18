import java.util.Arrays;

public class stack_program {

    //for is empty
    public static boolean isempty(int top){
        if (top==-1) {
            return true;
        }

        return false;
    }
    //element for peek
    public static int peek(int[] stack,int top){
        if (isempty(top)) {
            System.out.println("stack is empty");
            return -1;
        }
        return stack[top];
    }
    //push element into stack
    public static int push(int[] stack,int top,int value){
      if (top==stack.length-1) {
        System.out.println("stack is overflow");
        return top;
      }
      top++;
      stack[top]=value;
      return top;
    }

    //pop element form stack
    public static int pop(int[] stack,int top){
        if (isempty(top)) {
            System.out.println("stack is underflow");
            return top;
        }
       System.out.println(stack[top]+" poped element:-");
        top--;
        return top;
    }
    public static void main(String[] args) {
        int[] stack=new int[5];
        int top=-1;
        // top=push(stack,top , 10);
        // top=push(stack, top, 20);
        // top=push(stack, top, 30);
        // top=push(stack, top, 40);
        // top=push(stack, top, 50);
          top=pop(stack, top);

        // while (!isempty(top)) {
        //     top=pop(stack, top);
        // }
        // System.out.println("peek element is:-"+peek(stack, top));

        // System.out.println(Arrays.toString(stack));

    }
    
}
