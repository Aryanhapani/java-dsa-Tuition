public class hw8 {
    public static void main(String[] args) {
        Employee e1=new Employee(1, "a", Jobtitle.PEON , 45000);
        Employee e2=new Employee(2, "b", Jobtitle.PROF, 55000);
        Employee e3=new Employee(3, "c", Jobtitle.HOD, 35000);
        Employee e4=new Employee(4, "d", Jobtitle.PRINCIPAL , 25000);
        Employee e5=new Employee(5, "e", Jobtitle.PEON , 35000);
        Employee e6=new Employee(6, "f", Jobtitle.PROF, 40000);
        Employee e7=new Employee(7, "g", Jobtitle.HOD , 70000);
        Employee e8=new Employee(8, "h", Jobtitle.PRINCIPAL, 34000);
        Employee e9=new Employee(9, "i", Jobtitle.PEON , 90000);
        Employee e10=new Employee(10, "j", Jobtitle.PROF , 44000);

        Employee[] emp={
         e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,
        };

        calculate(emp);



    }

    static void calculate(Employee[] emp){
        int peon=0;
        int  prof=0;
        int pinciple=0;
        int hod=0;

        for(int i=0;i<emp.length;i++){
           if(emp[i].JOB==Jobtitle.HOD){
            hod+=emp[i].salary;
           }else if(emp[i].JOB==Jobtitle.PEON){
            peon+=emp[i].salary;
           }else if(emp[i].JOB==Jobtitle.PRINCIPAL){
            pinciple+=emp[i].salary;
           }else if(emp[i].JOB==Jobtitle.PROF){
            prof+=emp[i].salary;
           }
        }

        System.out.println(hod);
        System.out.println(peon);
        System.out.println(prof);
        System.out.println(pinciple);

    }
    
}

class Employee{
    int empid;
    String name;
    Jobtitle JOB;
    int salary;

    public Employee(int empid,String name,Jobtitle JOB,int salary){
        this.empid=empid;
        this.name=name;
        this.JOB=JOB;
        this.salary=salary;
    }

}


enum Jobtitle{
    PEON,PROF,HOD,PRINCIPAL,
}
