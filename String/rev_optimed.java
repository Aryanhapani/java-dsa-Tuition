public class rev_optimed {
    public static void main(String[] args) {
         String str="good morning";
        char[] arr=str.toCharArray();
        int start=0;

        for (int i=0;i<=arr.length;i++){
           if (i==arr.length || arr[i]==' '){
               int left=start;
               int right=i-1;

               while (left < right){
                   char t=arr[left];
                   arr[left]=arr[right];
                   arr[right]=t;
                   left++;
                   right--;
               }
               start=i+1;
           }
        }
        System.out.println(new String(arr));
    }
}
