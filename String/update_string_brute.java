public class update_string_brute {
    public static void main(String[] args) {
        String name="aryan";

        char[] arr=name.toCharArray();

        for(int i=0;i<arr.length;i++){
            if (arr[i]=='y') {
                arr[i]='j';
            }
        }

        String res=new String(arr);
        System.out.println(res);
    }
}
