public class find_unique_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int x=4;
        int count=0;

        for(int i=0;i<arr.length;i++){

           
                if(arr[i]==x){
                    count++;
                }
            
            }
            if (count < 2) {
                System.out.println("unique");
            }else{
                System.out.println("not");
            }
    }
}
