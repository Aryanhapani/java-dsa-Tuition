public class check_if_element_present_or_not {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int element=5;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("element is present");
                return;
            }else{
                System.out.println("element is not present");
                return;
            }
        }

    }
    
}
