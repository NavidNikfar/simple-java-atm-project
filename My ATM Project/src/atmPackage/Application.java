package atmPackage;
 import java.util.*;
public class Application {
    public static void main(String[] args){
        double amount;
        int selection;
        String username,password;
        ATM account = new ATM();
        Scanner input = new Scanner(System.in);
        System.out.println("*****welcome to ATM*****");
        System.out.print("type your username : ");
        username = input.nextLine();
        System.out.print("type your password : ");
        password = input.nextLine();
        boolean result = account.signIn(username,password);
        if (result ==true )
        {
            System.out.println("welcome");
        
        System.out.println("select your opperation");
        do {
        System.out.println("1.withdraw");
        System.out.println("2.deposite");    
        System.out.println("3.chek balance");  
        System.out.println("4.exit"); 
        selection = input.nextInt();
        switch(selection){
            case 1:
                System.out.println("enter amount of money you want to withdraw");
                amount = input.nextDouble();
                account.withdraw(amount);
                break;
            case 2:
                System.out.println("enter amount of money you want to deposite");
                amount = input.nextDouble();
                account.deposite(amount);
                break;
            case 3:
                account.chekBalance();
                break;
            case 4:
                System.out.println("thank you for using our ATM");
                break;         
        }
        } while ( selection !=4);  
        }
        else{
            System.out.println(" username or password is incorrect");
        }
            
    }
}
