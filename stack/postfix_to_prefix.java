import java.util.Stack;

public class postfix_to_prefix {
    public static boolean isoperator(int x){
        switch (x){
            case '+':
            case '-':
            case '*':
            case '%':
            case '/':
                return true;
        }
        return false;
    }

    public static String conert(String str){
        Stack<String> stack=new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if (isoperator(ch)){
                String op1=stack.pop();
                String op2=stack.pop();
                String combine= ch + op2 + op1;
                stack.push(combine);
            }else{
                stack.push(ch+"");
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String s="ABC/-AK/L-*";
        System.out.println(conert(s));
    }
}
