public class missing_number_sum {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=arr.length+1;
        int expectsum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(expectsum-sum);
    }
}
