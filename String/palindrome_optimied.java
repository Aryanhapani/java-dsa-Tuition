public class palindrome_optimied {
     public static boolean palindrome(String s){
        
        int left=0;
        int right=s.length()-1;
       
        while (left < right){
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        
        return true;
    }
    public static void main(String[] args) {
        
   String str="madam ioo nitin";

  

   String[] strings=str.split(" ");

   for (int i=0;i<strings.length;i++){
     if (!palindrome(strings[i])) {
        System.out.println("not palindrome");
        return;
     }
   }

   System.out.println("palindrome");
    
    }
}

