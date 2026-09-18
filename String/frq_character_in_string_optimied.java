public class frq_character_in_string_optimied {
    public static void main(String[] args) {
        String s1="hello how are you";

        int[] arr=new int[128];

        for(int i=0;i<s1.length();i++){
            int ascii=s1.charAt(i);
            arr[ascii]=arr[ascii]+1;
        }

        for(int i=0;i<128;i++){
            if (arr[i]>0) {
                System.out.println((char)i+":-"+arr[i]);
            }
        }
    }
}
