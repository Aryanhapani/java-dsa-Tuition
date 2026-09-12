import java.util.Arrays;

public class sort_string_lowercase {
    public static void main(String[] args) {
        String str="banana";

        char[] arr=str.toCharArray();
        Arrays.sort(arr);

        String res=new String(arr);
        System.out.println(res);
    }
}
