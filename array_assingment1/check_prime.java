public class check_prime {
    public static void main(String[] args) {
        int arr[]={1,3,6,7,21,11,15,5};

        for(int i=0;i<arr.length;i++){
            if(arr[i] <= 1){
                continue;
            }
            int count=0;

            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(arr[i]);
            }
        }
    }
}
