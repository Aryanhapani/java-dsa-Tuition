public class check_prime2 {
    public static void prime(int n){
      if(n==1){
        return;
      }

      for(int i=2;i<n;i++){
        if(n%i==0){
            return;
        }
      }

      System.out.println(n);
    }
    public static void main(String[] args) {
        int arr[]={1,3,6,7,21,11,15,5};

        for(int i=0;i<arr.length;i++){
            prime(arr[i]);
        }
    }
}
