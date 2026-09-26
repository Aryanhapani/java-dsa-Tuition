import java.util.Stack;

public class prefix_to_infix {
    public static  boolean isoperator(int x){
      switch (x) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
            return true;
            }


            return  false;
    }

    //convert prefix to infix
    public static String convert(String str){

        Stack<String> stack=new Stack<>();


        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
           if (isoperator(ch)) {
               
               String op1=stack.pop();
               String op2=stack.pop();
               String combine="("+op1+ ch+op2+")";
               stack.push(combine);
           }else{

              stack.push(ch+"");
           }
        }

       return stack.pop();

    }
   public static void main(String[] args) {
    String exp="+AB";
    System.out.println(convert(exp));
   }
}
