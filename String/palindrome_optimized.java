public class palindrome_optimized {
    public static void main(String[] args) {
        String s="madam eye nitin";

        

        int start=0;

        for(int i=0;i<=s.length();i++){

            if (i==s.length() || s.charAt(i)==' ') {
                int left=start;
                int right=i-1;

                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        System.out.println("not same");
                        return;
                        
                    }


                    left++;
                    right--;
                }
                start=i+1;
                
            }
        }
        System.out.println("same");


    }
    
}
