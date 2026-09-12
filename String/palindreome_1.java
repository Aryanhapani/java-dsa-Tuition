import java.util.Scanner;

public class palindreome_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        String name2="";
        for(int i=name.length()-1;i>=0;i--){
            name2 = name2 + name.charAt(i);
        }

        if (name.equals(name2)) {
            System.out.println("palindrome");
            
        }else{
            System.out.println("not palindrome");
        }

    }
}
