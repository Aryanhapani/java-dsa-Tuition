public class check_if_string_have_equal_digit_char {
    public static void main(String[] args) {
         String str="hello1   2387";
         int charcount=0;
         int digitcount=0;




        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                continue;
            }

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ||str.charAt(i)>= 'A' &&str.charAt(i)<= 'Z'){
               charcount++;
            }else {
                digitcount++;
            }
        }

        if (charcount==digitcount){
            System.out.println("same count");
        }else {
            System.out.println("not same count");
        }


    }
}
