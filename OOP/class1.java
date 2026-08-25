public class class1 {
    public static void main(String[] args) {
        System.out.println("student 1:-");

        student s1=new student(34,"arya",89);
        // s1.rollno=34;
        // s1.sname="aryan";
        // s1.marks=67;
        s1.printmarks();
        s1.printname();
        s1.printrollno();
    
        System.out.println("student 2:-");

        student s2=new student(45,"golu",56);
        // s2.rollno=45;
        // s2.sname="raj";
        // s2.marks=69;
        s2.printmarks();
        s2.printname();
        s2.printrollno();
       
        System.out.println("student 3:-");
        
        student s3=new student(s1);
        s3.printrollno();
        s3.printname();
        s3.printmarks();
        
    }
    
}

class student{
    int rollno;
    String sname;
    int marks;
    
    //this is called as defult constructer why because of it was created by compiler autimatically 
    student(){};
 

    //parameterized constructer
    public student(int rollno,String sname,int marks){
        this.rollno=rollno;
        this.sname=sname;
        this.marks=marks;
    }

    //copy constructor
    public student(student oldvalue){
        rollno=oldvalue.rollno;
        sname=oldvalue.sname;
        marks=oldvalue.marks;
    }


    public void printmarks(){

      System.out.println(marks);
    }

    public void printname(){
        System.out.println(sname);
    }

    public void printrollno(){
        System.out.println(rollno);
    }
}
