public class static_method {
    public static void main(String[] args) {
        student s1=new student(34,"x");
        student s2=new student(56,"l");
        student s3=new student(23,"j");
        student.gm();
        s1.display();
        s2.display();
        s3.display();

    }
}

class student{
    int rno;
    String name;
   static String schooladdress;

   static{
    student.schooladdress="xyz";
   }

   public static void gm(){
        // System.out.println("good morining");
        System.out.println(schooladdress);
        
   }

    public student(int rno,String name){
        this.rno=rno;
        this.name=name;
        
    }
    
    public void display(){
        System.out.println(rno);
        System.out.println(name);
        System.out.println(schooladdress);
        gm();
    }
}