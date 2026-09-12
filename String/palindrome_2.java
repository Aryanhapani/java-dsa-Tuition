import java.util.Scanner;

public class palindrome_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
      

      int i=0;
      int j=name.length()-1;
      boolean p=true;

        while (i  < j) {
            
            if (name.charAt(i) != name.charAt(j)) {
                    p=false;
                    break;
                
            }

            i++;
            j--;
            
        }

       if (p) {
        System.out.println("palindrome");
         }else{
            System.out.println("not paliondrome");
         }
       
       
    }
}
