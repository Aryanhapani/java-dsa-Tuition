public class print_rev_brute {
   public static String rev(String s){
        String st="";
        for (int i=s.length()-1;i>=0;i--){
            st+=s.charAt(i);
        }

     return st;
    }
    static void main() {
         String str="good evening";

         String[] strings=str.split(" ");

         for (int i=0;i<strings.length;i++){
           String sout=rev(strings[i]);
             System.out.print(sout+" ");
         }

        }
}
