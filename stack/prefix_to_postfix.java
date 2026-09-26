import java.util.Stack;

public class prefix_to_postfix {
    public static boolean isopertor(int x){
        switch (x){
            case '+':
            case '-':
            case '*':
            case '/':
            case '%':
                return true;

        }
        return false;
    }

    public static String convert(String str){
        Stack<String> stack=new Stack<>();
        for (int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if (isopertor(ch)){
                String op1=stack.pop();
                String op2=stack.pop();
                String combine= op1 + op2 + ch;
                stack.push(combine);
            }else{

                stack.push(ch+"");
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp="*-A/BC-/AKL ";
        System.out.println(convert(exp));
    }
}
