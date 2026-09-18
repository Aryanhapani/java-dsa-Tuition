public class remove_duplicate_character_optimied {
    public static void main(String[] args) {
         String s1="hello";

    boolean[] arr=new boolean[128];

    for (int i=0;i<s1.length();i++){
       int ascii=s1.charAt(i);
       arr[ascii]=true;
    }


    for (int i=0;i<128;i++){
        if (arr[i]==true){
            System.out.println((char)i+":-");
        }
    }

    }
}
