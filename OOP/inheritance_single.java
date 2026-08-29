public class inheritance_single {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="aryan";
        s1.age=67;
        s1.rno=56;
        s1.sem=6;
        s1.display();
    }
}

//single inheritance
class person{
    String name;
    int age;
}

class student extends person{
    int rno;
    int sem;


    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(rno);
        System.out.println(sem);
    }
}


