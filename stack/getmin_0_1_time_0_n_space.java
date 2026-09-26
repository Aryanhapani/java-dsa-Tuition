import java.util.Arrays;

public class getmin_0_1_time_0_n_space{
    public static int push(int[] stack,int[] minstack,int top,int value){

        top++;
        stack[top]=value;
        if (top==0) {
            minstack[top]=value;
            
        }else{
            minstack[top]=Math.min(value, minstack[top-1]);
        }
        return  top;
    }
    public static void main(String[] args) {
        int[] stack=new int[5];
        int[] minstack=new int[5];
        int top=-1;

        top=push(stack,minstack, top, 10);
        top=push(stack,minstack, top, 80);
        top=push(stack,minstack, top, 60);
        top=push(stack,minstack, top, 40);
        top=push(stack,minstack, top, 99);

        System.out.println(Arrays.toString(stack));
        System.out.println(Arrays.toString(minstack));


    }
 }