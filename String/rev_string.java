public class rev_string {
     public static String rev(String s){
        char[] arr=s.toCharArray();
         int left=0;
         int right=s.length()-1;

         while (left < right){
             char temp=arr[left];
             arr[left]=arr[right];
             arr[right]=temp;

             left++;
             right--;

         }

         s=new String(arr);

         return s;
    }
    static void main() {
         String str="good evening";

         String[] strings=str.split(" ");

         for (int i=0;i<strings.length;i++){
           String sout=  rev(strings[i]);
             System.out.print(sout+" ");
         }

        }
}
