public class count_fre_brute {
    public static void main(String[] args) {
         String str="hello how are you";

         char[] arr=str.replaceAll(" ", "").toCharArray();


         for (int i=0;i<arr.length;i++){
           int count=0;
           boolean p=false;
           //check repeated character
           for (int k=0;k<i;k++){
               if (arr[i]==arr[k]){
                   p=true;
                   break;
               }

           }

           if (p){
               continue;
           }

           for (int j=0;j<arr.length;j++){
               if (arr[i]==arr[j]){
                  count++;
               }
           }

             System.out.println(arr[i]+":-"+count);
         }
    }
}
