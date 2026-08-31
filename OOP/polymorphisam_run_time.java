import java.util.Scanner;

public class polymorphisam_run_time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for SBI and other for another");
        int choice=sc.nextInt();
        Bank bank;
        if(choice==1){
            bank=new SBI();
        }else{
            bank=new Kotak();
        }
        bank.printintrest();
    }
}

class Bank{
    int bankcode;
    String address;

    public void printintrest(){
        System.out.println(4);
    }
}

class SBI extends Bank{

}

class Kotak extends Bank{
    
    public void printintrest(){
        System.out.println(5);
    }

}