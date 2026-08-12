public class second_minimun {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,60,45,34,79};

        int max=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                third=sec;
                sec=max;
                max=arr[i];
            }else if(sec <arr[i] && max > arr[i]){
                third=sec;
                sec=arr[i];
            }else if(third < arr[i] && sec > arr[i]){
                third=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(sec);
        System.out.println(third);
    }
}
