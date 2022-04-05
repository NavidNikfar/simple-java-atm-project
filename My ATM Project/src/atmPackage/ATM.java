
package atmPackage;

public class ATM {
    int acount_number;
    double balance= 10000;
    
    public void chekBalance(){
        System.out.println(" balance is = "+ balance);
    }
    
    public void withdraw(double amount){
        if(balance>=amount)
        {
            balance= balance - amount;
            System.out.println("your balance is : "+ balance);
        }
        else
            System.out.println("you have not enough money to withdraw");
    }
    
    public void deposite(double amount){
        balance = balance + amount;
        System.out.println("your balance is : "+ balance);

    }
    
    public boolean signIn(String un, String psw)
        {
        String username = "admin";
        String password = "12345";
        if(username.equals(un) && password.equals(psw))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
