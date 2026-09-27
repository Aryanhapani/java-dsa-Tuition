import java.util.Stack;

public class remove_dulicate_char {
 public static void main(String[] args) {
     String s="abbaca";
        Stack<Character> s1=new Stack<>();

        s1.push(s.charAt(0));

        for (int i=1;i<s.length();i++){
           if (!s1.isEmpty() && s1.peek().equals(s.charAt(i))){
               s1.pop();
           }else{
               s1.push(s.charAt(i));

           }



        }


        StringBuilder result=new StringBuilder();

        for (int i=0;i<s1.size();i++){
            char ch=s1.get(i);
            result.append(ch);
        }


        System.out.println(result.toString());
 }
}
