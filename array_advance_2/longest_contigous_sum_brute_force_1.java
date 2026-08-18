public class longest_contigous_sum_brute_force_1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};

        int max=Integer.MIN_VALUE;
       //start
        for(int i=0;i<arr.length;i++){
            int s=i;
            for(int j=i;j<arr.length;j++){
                int e=j;
                int sum=0;
                //print
                for(int k=s;k<=e;k++){
                    System.out.print(arr[k]);
                    sum+=arr[k];
                }
                System.out.println();
                if(max < sum){

                    max=sum;
                }
            }
            System.out.println();
        }
        System.out.println(max);
    }
}
