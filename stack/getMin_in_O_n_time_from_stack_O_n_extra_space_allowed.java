import java.util.Arrays;

public class getMin_in_O_n_time_from_stack_O_n_extra_space_allowed {
    public static int getmin(int[] stack,int top){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=top;i++){
            if (min > stack[i]) {
                min=stack[i];
            }
        }

        return min;
    }
    public static int push(int[] stack,int[] minstack,int top,int value){
        top++;
        stack[top]=value;
        minstack[top]=getmin(stack, top);
        return top;
    }
    public static void main(String[] args) {
        int[] stack=new int[5];
        int[] minstack=new int[5];
        int top=-1;
        top=push(stack,minstack,top, 5);
        top=push(stack,minstack,top, 2);
        top=push(stack,minstack,top, 3);
        top=push(stack,minstack,top, 8);
        top=push(stack,minstack,top, 9);

        System.out.println(Arrays.toString(stack));
        System.out.println(Arrays.toString(minstack));
    }
}
