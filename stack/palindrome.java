import java.util.Stack;

public class palindrome {
    public static void main(String[] args) {
        String s="nitin";
       int n=s.length()-1;
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();

       for (int i=0;i<s.length();i++){
           stack1.push(s.charAt(i));
           stack2.push(s.charAt(s.length()-i-1));
       }

       if (stack1.equals(stack2)){
           System.out.println("same");
       }else {
           System.out.println("not");
       }


    }
}
