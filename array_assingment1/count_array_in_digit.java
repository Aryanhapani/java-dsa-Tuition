public class count_array_in_digit {
    public static void main(String[] args) {
        int arr[]={6,3,5,2,7,6};
        int d=6;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                count++;
            }
        }
        System.out.println(count);
    }
}
