public class kadan_s_algo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int max=Integer.MIN_VALUE;
        int currsum=0;

        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];

            if(max < currsum){
                max=currsum;
            }

            if(currsum < 0){
                currsum=0;
            }
        }
        System.out.println(max);
    }
}
