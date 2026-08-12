public class pair_sum_using_binary {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,8,9,10,13,14};
        int target=13;

        for(int i=0;i<arr.length;i++){
            int start=i+1;
            int end=arr.length-1;
            
            
            while (start <= end) {
                int mid=(start+end)/2;

                if(arr[i]+arr[mid]==target){
                    System.out.println("found"+arr[i]+arr[mid]);
                    return;
                }

                if(arr[i]+arr[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
                
            }
        }

    }
}
