import java.util.Stack;

public class postfix_to_infix {
     public static boolean isoperator(int x){
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
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (isoperator(ch)){
                String op1=stack.pop();
                String op2=stack.pop();
                String combine="(" + op2 + ch + op1 +")";
                stack.push(combine);

            }else {

                stack.push(ch+"");
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
                String exp="AB-DE+F*/";
        System.out.println(convert(exp));
    }
}
