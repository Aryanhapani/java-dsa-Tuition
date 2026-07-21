public class Print_alternate_elements_from_last_in_array {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9,10};

        for(int i=arr.length-1;i>=0;i=i-2){
            System.out.println(arr[i]);
        }
    }
}
