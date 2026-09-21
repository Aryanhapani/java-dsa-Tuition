import java.util.Arrays;

public class rev_all_using_stack {
    public static char pop(char[] arr,int top){
       return arr[top];
    }
    public static int push(char[] arr,char ch,int top){

      top++;
      arr[top]=ch;
      return top;
    }
    public static void main(String[] args) {
        String s="hello";

        char[] arr=new char[s.length()];

        int top=-1;

        for(int i=0;i<arr.length;i++){
         top=push(arr, s.charAt(i), top);
        }

        String res="";

        // for(top=arr.length-1;top>=0;top--){
        //    res  += pop(arr, top);
        // }

        while (top >= 0) {
            res += pop(arr, top);
            top--;
        }

        System.out.println(res);

        System.out.println(Arrays.toString(arr));
    }
}
