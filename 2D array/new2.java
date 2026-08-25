public class new2 {
    public static void pri(int n){

        for(int i=2;i<n;i++){
            if(n%i==0){
                continue;
               
            }
        }

        System.out.println(n);
    }
    public static void main(String[] args) {
        int arr[]={6,10,12};

        for(int i=0;i<arr.length;i++){
           pri(arr[i]);
        }
    }
}
