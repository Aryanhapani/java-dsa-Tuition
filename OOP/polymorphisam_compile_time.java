public class polymorphisam_compile_time {
    public static void main(String[] args) {
        student s1=new student();
      double ans=s1.sum(23.45,60);
        System.out.println(ans);
    }
}


class student{
    int rno;
    String name;

    public  int sum(int a,int b){
        return a+b;
    }

    //changing number of args
    public int sum(int a,int b,int c){
        return a+b+c;
    }

    //chnaging number of data type
    public double sum(double a,double b){
        return a+b;
    }
}