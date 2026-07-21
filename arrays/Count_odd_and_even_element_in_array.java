public class Count_odd_and_even_element_in_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        int oddcount=0;
        int evencount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }

    
}