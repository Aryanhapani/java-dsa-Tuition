public class reverse_string_memeory {
    public static void main(String[] args) {
        String str="aryan";
  
          //convert into array
        char[] arr=str.toCharArray();

         int left=0;
         int right=str.length()-1;


         while (left < right) {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

            
         }
     
          str=new String(arr);
         System.out.println(str);
    }
}
