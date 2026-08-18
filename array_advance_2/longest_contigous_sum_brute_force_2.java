public class longest_contigous_sum_brute_force_2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
            }
            System.out.println();
            if(max < sum){
                max=sum;
            }
        }
        System.out.println(max);
    }
} 
