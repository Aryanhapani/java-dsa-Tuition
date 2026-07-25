public class find_unique_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};

        for(int i=0;i<arr.length;i++){
            int count=0;

            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if (count < 2) {
                System.out.println(arr[i]);
            }
        }
    }
}
