public class linear_serach {
    public static void main(String[] args) {
        int arr[] = {12, 5, 8, 20, 15};
        int key = 20;
        

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("present element at index:-"+i);
                return;
            }
        }
        System.out.println("not");

    }
}
