public class getter_setter_method {
    public static void main(String[] args) {

        student s1=new student();
        s1.setname("aryan");
        s1.setage(34);

        System.out.println("name:-"+s1.getname());
        System.out.println("age:-"+s1.getage());


        
    }
}

class student{
   private int age;
   private String name;

    public void setage(int age){
        this.age=age;
    }

    public void setname(String name){
        this.name=name;
    }

    public int getage(){
        return age;
    }

    public String getname(){
        return name;
    }

}
