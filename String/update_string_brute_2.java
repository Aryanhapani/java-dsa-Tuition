public class update_string_brute_2 {
    public static void main(String[] args) {
        String str1="aryan";
        String str2="";

        for(int i=0;i<str1.length();i++){
            if (str1.charAt(i)=='a') {
                str2 = str2 + 'u';
            }else{
                str2 = str2 + str1.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
