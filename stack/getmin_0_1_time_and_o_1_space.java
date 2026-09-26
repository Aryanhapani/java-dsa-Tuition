import java.util.Arrays;

public class getmin_0_1_time_and_o_1_space {
    static int min;
    public static int push(int[] stack,int top,int value){
        //int oldmin=Math.min(value, stack[top-1]);
      // System.out.println(oldmin);

        top++;
        if (top==0){
        stack[top]=value;
        min=value;
        }else if(value < min){
         stack[top]=2*value-min;
         min=value;
        }else{
            stack[top]=value;
        }

       
        return top;
    }
    public static void main(String[] args) {
        int[] stack=new int[4];
        int top=-1;

        top=push(stack, top, 10);
        top=push(stack, top, 2);
        top=push(stack, top, 20);
        top=push(stack, top, 200);
       
      

        System.out.println(Arrays.toString(stack));
    }
}
