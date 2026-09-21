import java.util.Stack;

public class palindrome_optimized {
    public static void main(String[] args) {
        String s="nitin";

        Stack<Character> stack1=new Stack<>();

        for(int i=0;i<s.length();i++){
            stack1.push(s.charAt(i));
        }
        System.out.println(stack1);

        int i=0;
        

        while (!stack1.isEmpty()) {
            if (s.charAt(i) != stack1.pop()) {
                System.out.println("not");
                return;
            }

            i++;

        }
        System.out.println("same");
    }
}
