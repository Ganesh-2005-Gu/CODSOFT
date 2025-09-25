import java.util.*;

class Bank_account {
   
    private double balance;

    Bank_account( double initialBalance) {
        
        this.balance = initialBalance;
    }

     void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited:" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

     void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}
class ATM{
  private Bank_account Account;

  ATM(Bank_account account){
    this.Account=account;
  }
  public void main(){
    Scanner sc=new Scanner(System.in);
    boolean exit=false;
    while(!exit){
      System.out.println("Choose an option:");
      System.out.println("1. Deposit");
      System.out.println("2. Withdraw");
      System.out.println("3. Check Balance");
      System.out.println("4. Exit");
      int choice=sc.nextInt();
      switch(choice){
        case 1:
          System.out.print("Enter amount to deposit: ");
          double depositAmount=sc.nextDouble();
          Account.deposit(depositAmount);
          break;
        case 2:
          System.out.print("Enter amount to withdraw: ");
          double withdrawAmount=sc.nextDouble();
          Account.withdraw(withdrawAmount);
          break;
        case 3:
          Account.displayBalance();
          break;
        case 4:
          exit=true;
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid option. Please try again.");
      }
    }
    sc.close();
  }
}
public class Task3 {
    public static void main(String[] args) {
        Bank_account myAccount = new Bank_account(1000.0); 
        ATM atm = new ATM(myAccount);
        atm.main();
    }
}
