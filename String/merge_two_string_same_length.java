public class merge_two_string_same_length {
    public static void main(String[] args) {
                String str1 = "abc";
        String str2 = "123";
        String str3 = "";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        char[] arr3 = new char[arr1.length + arr2.length];


        int index1 = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (i % 2 == 0) {
                arr3[i] = arr1[index1];
                index1++;
            }
        }

        int index2=0;
        for (int i=0;i<arr3.length;i++){
            if (i%2!=0){
                arr3[i]=arr2[index2];
                index2++;
            }
        }

        str3=new String(arr3);
        System.out.println(str3);
    }
}
