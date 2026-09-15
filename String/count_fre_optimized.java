import java.util.Arrays;

public class count_fre_optimized {
    public static void main(String[] args) {
        String str="how are you bro";

        char[] arr=str.toCharArray();

        Arrays.sort(arr);

        int l=str.length();
        int i=0;

        while (i< l) {
            char ch=arr[i];

            int j=i;
            while (j < l && arr[j]==ch) {
                j++;
                
            }
            int count=j-i;
            System.out.println(ch+":-"+count);
            i=j;
        }
    }
}
