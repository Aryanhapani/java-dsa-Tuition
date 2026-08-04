public class linear {
    public static void main(String[] args) {
        int arr[]={1,4,5,6,7,3,9,10,15,14};
        int key=9;

        for(int i=0;i<arr.length;i++){
                if(arr[i]==key){
                    System.out.println("found element:"+arr[i]);
                    return;
                }
        }
        System.out.println("not found element");
    }
}
