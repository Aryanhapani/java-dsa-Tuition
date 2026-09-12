public class count_words_in_string_2 {
    public static void main(String[] args) {
        String name="aryan hapani";

        
       
       int c=0;
      

       //empty string
       if(name.length()==0){
           c=0;
          return ;
       }
      

       //for first chracter      
       if (name.charAt(0)!= ' ') {
            c++;
            
        }

        //for all other words
       for(int i=1;i<name.length();i++){
        
         if (name.charAt(i)!= ' ' &&  name.charAt(i-1)==' ') {
            c++;
         }
    }

    System.out.println(c);
       
    }
}
