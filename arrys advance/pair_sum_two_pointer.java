public class pair_sum_two_pointer {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,8,9,10,13,14};
        int target=13;

        int start=0;
        int end=arr.length-1;

        while (start < end) {
            if(arr[start]+arr[end]==target){
               System.out.println("found"+arr[start]+arr[end]);
               return;
            }

            if(arr[start]+arr[end]<target){
                start++;
            }else{            
                end--;
            }
            
        }
        System.out.println("pair not found");
    }
}
