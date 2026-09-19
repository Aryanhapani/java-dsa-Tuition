public class rev_word {
    public static char pop(char[] arr,int top){
        return arr[top];
    }
    public static int push(char[] arr,char ch,int top){

        top++;
        arr[top]=ch;
        return  top;
    }
    public static void main(String[] args) {
        String s="hello how are you";

        char[] arr=new char[s.length()];
   

        int top=-1;
        String res="";

        for(int i=0;i<arr.length;i++){
            if (s.charAt(i)!=' ') {
                top=push(arr, s.charAt(i), top);
            }else{

                while (top >= 0) {
                    res+= pop(arr, top);
                    top--;
                }
                res += " ";
            }
        }
     
        //for last word
        while (top >= 0) {
            res += pop(arr, top);
            top--;
        }

        System.out.println(res);
    }
}
