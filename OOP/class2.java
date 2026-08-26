public class class2 {
    public static void main(String[] args) {
        student s1=new student(1, "s", 45, 56, 89);
        student[] students=new student[5];//created object array
        students[0]=s1;//put value
        students[1]=new student(2, "k", 56,90, 34);//put value
        students[2]=new student(3, "e", 65,94, 40);//put value
        students[3]=new student(4, "f", 70,80, 69);//put value
        students[4]=new student(5, "u", 50,55, 57);//put value        
         student[] top3=s1.gettop3(students);
        for(student s:top3){
           s.printdetails();
        }
       
    }
    
}

class student{
    int rollno;
    String name;
    int m1 ,m2,m3,toalmarks;


    public student[] gettop3(student[] students){
        student[] top3=new student[3];
        for(int i=0;i<students.length;i++){
            for(int j=0;j<students.length-i-1;j++){
                if(students[j].toalmarks > students[j+1].toalmarks){
                 student t=students[j];
                 students[j]=students[j+1];
                 students[j+1]=t;
                }
            }
            top3[0]=students[0];
            top3[1]=students[1];
            top3[2]=students[2];
        }

        return top3;
    }

    //parameter constructor
    public student(int rollno,String name,int m1,int m2,int m3){
        this.rollno=rollno;
        this.name=name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.toalmarks=m1+m2+m3;
    }

    public void printdetails(){
        System.out.println(name +" "+toalmarks);
    }
}
