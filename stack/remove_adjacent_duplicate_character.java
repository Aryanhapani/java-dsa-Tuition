public class remove_adjacent_duplicate_character {
     public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
         int count=0;
          int max=0;

      for(int i=0;i<s.length();i++){
          if (s.charAt(i)=='('){
              count++;
              if (max< count){
                  max=count;
              }
          }

          if (s.charAt(i)==')'){
              count--;
          }
      }


        System.out.println(max);
     }
}
