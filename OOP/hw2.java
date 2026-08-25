public class hw2 {
    public static void main(String[] args) {

        Account s1=new Account(234, "xyz", 10000,5);

        s1.calculateintrest();
        s1.display();
        
    }
}


class Account{
    int AccountNumber;
    String CustName;
    int balance;
    int intrest_rate;

    public Account(int AccountNumber,String CustName,int balance,int intrest_rate){
        this.AccountNumber=AccountNumber;
        this.CustName=CustName;
        this.balance=balance;
        this.intrest_rate=intrest_rate;
    }

    public void calculateintrest(){
       int intrest=(balance*intrest_rate)/100;
       balance=balance+intrest;
    }

    public void display(){
        System.out.println(AccountNumber);
        System.out.println(CustName);
        System.out.println(balance);
        System.out.println(intrest_rate);
    }
}