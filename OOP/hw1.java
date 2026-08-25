public class hw1 {
    public static void main(String[] args) {
        
        student s1=new student();

        s1.setdetials(45,"aryan",56,78,90);
        s1.calculatetotal();
        s1.display();
        
        
    }
}


class student{
    int rollno;
    String stdname;
    int m1;
    int m2;
    int m3;
    int totalmarks;


    public void setdetials(int rollno,String stdname,int m1,int m2,int m3){
        this.rollno=rollno;
        this.stdname=stdname;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }

    public void  calculatetotal(){
          totalmarks=m1+m2+m3;
          

    }


    public void display(){
        System.out.println(rollno);
        System.out.println(stdname);
        System.out.println(totalmarks);
    }
}
