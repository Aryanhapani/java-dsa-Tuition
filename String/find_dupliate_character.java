public class find_dupliate_character {
    public static void main(String[] args) {
         String str="programming";

   String printsofar="";
   for (int i=0;i<str.length();i++){
       char ch=str.charAt(i);

           int count=0;
       if (printsofar.indexOf(ch)==-1){
           for (int j=0;j<str.length();j++){
               if (ch==str.charAt(j)){
                   count++;
               }
           }
            printsofar+=ch;
           if (count >= 2){

               System.out.println(str.charAt(i));
           }
       }

   }


    }
}
