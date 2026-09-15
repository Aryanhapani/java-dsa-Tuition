public class remove_vowel_brute {
    public static void main(String[] args) {
         String str="hello how are you";
         String str2="";

         char[] arr=str.toCharArray();

         for (int i=0;i<arr.length;i++){
             if (arr[i]=='a'||arr[i]=='e'||arr[i]=='o'||arr[i]=='u'){
                 continue;
             }else {
                 str2=str2+arr[i];
             }
         }

         str=new String(str2);
         System.out.println(str);
    }
}
