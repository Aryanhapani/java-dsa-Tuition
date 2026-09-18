public class find_dulicate_char_optimized {
    public static void main(String[] args) {
        String str="programming";

   int[] arr=new int[128];

   for (int i=0;i<str.length();i++){
       int ascii=str.charAt(i);
       arr[ascii]=arr[ascii]+1;

       }

   for (int i=0;i<128;i++){
       if (arr[i] >= 2){
           System.out.println((char)i+":-"+arr[i]);
       }
   }
    }
}
