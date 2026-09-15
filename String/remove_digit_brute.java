public class remove_digit_brute {
    public static void main(String[] args) {
         String str="hello123world45";
         String str2="";




        for (int i=0;i<str.length();i++){

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ||str.charAt(i)>= 'A' &&str.charAt(i)<= 'Z'){
                str2=str2+str.charAt(i);
            }
        }

        str=new String(str2);
        System.out.println(str);
    }
}
