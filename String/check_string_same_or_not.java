public class check_string_same_or_not {
    public static void main(String[] args) {
        String str1 = "aryan hapani kese ho";
        String str2 = "aryan hapani ";

        int i = 0;
        int j = 0;
        boolean p = true;

        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) != str2.charAt(j)) {
                p = false;
                break;
            }

            i++;
            j++;
        }

      

        if (i < str1.length() || j < str2.length()) {
            p=false;
        }

        if (p) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
