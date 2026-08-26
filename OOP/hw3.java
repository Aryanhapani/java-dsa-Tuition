public class hw3 {
    public static void main(String[] args) {
        Account s1=new Account();
        s1.setAccountDetails(23, "xyz", 10000);
        s1.Withdraw(50000);
        s1.deposit(5000);
        s1.display();
    }
}

class Account{
    int AccountNo;
    String CustName;
    int accountBalance;

    public void setAccountDetails(int AccountNo,String CustName,int accountBalance){
      this.AccountNo=AccountNo;
      this.CustName=CustName;
      this.accountBalance=accountBalance;
    }


    public void Withdraw(int Withdraw){
        if(Withdraw <= accountBalance){
    
            accountBalance=accountBalance-Withdraw;

        }else{
            System.out.println("insuffient balance");
        }     
       }

    public void deposit(int deposit){
        accountBalance=accountBalance+deposit;
    }

    public void display(){
        System.out.println(AccountNo);
        System.out.println(CustName);
        System.out.println(accountBalance);
    }
}