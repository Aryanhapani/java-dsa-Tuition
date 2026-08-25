import javax.sound.sampled.SourceDataLine;

public class newc {


    public static void main(String[] args) {
        String str="leet";
        StringBuilder binary=new StringBuilder();

        for(int i=0;i<str.length();i++)
{
         char ch=str.charAt(i);
        
         
         binary.append(String.format("%8s", Integer.toBinaryString(ch)).replace(' ','0'));
}

       System.out.println("binary" + binary.toString());

       String binstr=binary.toString();
       System.out.println(binstr);
       

       String filp=new StringBuilder(binstr).reverse().toString();
       System.out.println(filp);

       if(binstr.equals(filp)){
        System.out.println("true");
       }else{
        System.out.println("false");
       }

    }

   

}