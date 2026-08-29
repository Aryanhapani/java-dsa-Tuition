import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        student s1=new student();
        s1.input(sc);
        System.out.println("student1:-");
        System.out.println("totalmarks:-"+s1.totalmarks());
        System.out.println("higest:-"+s1.gethighest());
        System.out.println("lowest:-"+s1.getlowest());
        System.out.println("average:-"+s1.average());
        System.out.println("passcount:-"+s1.getpasscount());
        student s2=new student();
        s2.input(sc);
        System.out.println("student2:-");
        System.out.println("totalmarks:-"+s2.totalmarks());
        System.out.println("higest:-"+s2.gethighest());
        System.out.println("lowest:-"+s2.getlowest());
        System.out.println("average:-"+s2.average());
        System.out.println("passcount:-"+s2.getpasscount());
        student s3=new student();
        s3.input(sc);
        System.out.println("student3:-");
        System.out.println("totalmarks:-"+s3.totalmarks());
        System.out.println("higest:-"+s3.gethighest());
        System.out.println("lowest:-"+s3.getlowest());
        System.out.println("average:-"+s3.average());
        System.out.println("passcount:-"+s3.getpasscount());
        student.totalstudents();
    }
}

class student{
    static int unqiue_number;
    int rollno;
    String name;
    int[] subject=new int[5];
    int totalmarks;


    public student(){
        unqiue_number++;
        this.rollno=unqiue_number;
        this.name=null;
        this.totalmarks=0;
    }

    public void input(Scanner sc){
        System.out.println("Enter name:-");
        name=sc.nextLine();
        System.out.println("Enter subject marks:-");
        for(int i=0;i<5;i++){
            System.out.println("subject marks"+(i+1)+":-");
            subject[i]=sc.nextInt();//main
        }
        sc.nextLine();
    }

    public void show(){
        System.out.println("rollno:-"+rollno);
        System.out.println("name:-"+name);
        for(int i=0;i<5;i++){
            System.out.println("your subject"+(i+1)+"marks"+subject[i]);
        }
    }

    public static void totalstudents(){
        System.out.println(unqiue_number);
    }


    public int totalmarks(){
        int totalmarks=0;
        for(int i=0;i<5;i++){
            totalmarks=totalmarks+subject[i];
        }
        return totalmarks;
    }

    public int gethighest(){
     int max=Integer.MIN_VALUE;
     for(int i=0;i<5;i++){
        if(max<subject[i]){
            max=subject[i];
        }
     }

     return max;
    }

    public int getlowest(){
        int low=Integer.MAX_VALUE;
        for(int i=0;i<5;i++){
            if(low > subject[i]){
                low=subject[i];
            }
        }

        return low;
    }

    public double average(){
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+subject[i];
        }

        return (double) sum/subject.length;
    }

    public int getpasscount(){
        int count=0;
        for(int i=0;i<5;i++){
            if(subject[i] >= 50){
                count++;
            }
        }

        return count;
    }
}

