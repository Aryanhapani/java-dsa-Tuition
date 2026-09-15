public class palindrome_all_words_brute {
     public static String palindrome(String s){
        char[] arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;

        while (left < right){
            char t=arr[left];
            arr[left]=arr[right];
            arr[right]=t;

            left++;
            right--;
        }
        s=new String(arr);
        return s;
    }
    public static void main(String[] args) {
        
   String str="madam ioo nitin";

   String str2="";

   String[] strings=str.split(" ");

   for (int i=0;i<strings.length;i++){
      String so=palindrome(strings[i]);
       str2=str2+so;

       if (i<strings.length-1){
           str2=str2+" ";
       }
   }
        System.out.println(str2);
   if (str.equals(str2)){
       System.out.println("palindrome");

   }else{
       System.out.println("not palindrome");
   }
    }
}
