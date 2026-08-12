public class second_largest {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,6,6,8,8,8};
    int max=Integer.MIN_VALUE;
    int sec=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        if(max < arr[i]){
            sec=max;
            max=arr[i];
        }else if(max != arr[i] && sec < arr[i]){
            sec=arr[i];
        }
    }
    System.out.println(sec);
}
}
