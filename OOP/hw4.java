public class hw4 {
    public static void main(String[] args) {

        student s1=new student(1,"x",56,89,70);
        student[] students=new student[5]; 
        students[0]=s1;
        students[1]=new student(2, "y", 57, 76, 90);
        students[2]=new student(3, "g", 87, 54, 87);
        students[3]=new student(4, "r", 99, 100, 80);
        students[4]=new student(5, "k", 88, 89, 90);
        
        student[] top3=s1.gettop3student(students);
        for(student s:top3){
           s.print();
        }
        
    }
}

class student{
    int rollno;
    String Name;
    int m1;
    int m2;
    int m3;
    int totalmarks;

    public student[]  gettop3student(student[] students){
       student[] top3=new student[3];
       student max=null;
       student sec=null;
       student third=null;

       for(int i=0;i<students.length;i++){
        if(max==null || max.totalmarks < students[i].totalmarks){
            third=sec;
            sec=max;
            max=students[i];
        }else if(max.totalmarks != students[i].totalmarks && (sec==null || sec.totalmarks < students[i].totalmarks)){
            third=sec;
            sec=students[i];
        }else if(sec.totalmarks != students[i].totalmarks && (third==null || third.totalmarks < students[i].totalmarks)){
            third=students[i];
        }
       }

       top3[0]=max;
       top3[1]=sec;
       top3[2]=third;

       return top3;
 
        
    }



    //constructor 
    public student(int rollno,String Name,int m1,int m2,int m3){
        this.rollno=rollno;
        this.Name=Name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.totalmarks=m1+m2+m3;
        }
    

        public void print(){
            System.out.println(Name+" "+totalmarks);
        }


    
}

