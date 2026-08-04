public class Binary {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=9 ;
        int strat=0;
        int end=arr.length-1;

        while (strat <= end) {
            int mid=(strat+end)/2;

            if(arr[mid]==key){
                System.out.println("found:- "+arr[mid]);
            }

            if(arr[mid] < key){
                strat=mid+1;
            }else{
                end=mid-1;
            }

            
        }
    }
}
