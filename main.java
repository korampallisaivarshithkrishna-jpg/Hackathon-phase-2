import java.util.Scanner;
class Bank Account{
String accountNumber;
String accountHolderName;
double balance;


public BankAccount(String accountNumber,String accountHolderName, double balance){
this.accountNumber = accountNumber;
this.accountHolderName = accountholderName;
this.balance = balance;
}
 

public void deposit(double amount){
if(amount >0){
balance =  balance + amount;
System.out.println("Deposired:" + amount);
}else{
System.out.println("Invalid deposit amount");
}
}
 public void withdraw(double amount) {
if (amount > 0 && amount <= balance){
balance = balance - amount;
System.out.println("Withdraw:" + amount);
}else{
System.out.println("Insufficient balance");
}else{
System.out.println("Invalid withdrawal amount");
}
}

public double checkBalance() {
return balance;



public void displayAccount() {
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder Name: " + accountHolderName);
System.out.println("Balance: " + balance);
}
}


public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


System.out.print("Enter account number: ")
String accountNumber = sc.nextLine();        
 System.out.print("Enter account holder name: ");
 String accountHolderName = sc.nextLine();
        
 System.out.print("Enter initial balance: ");
  double balance = sc.nextDouble();
        
        
  BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);
        
    
System.out.print("Enter amount to deposit: ");
double depositAmount = sc.nextDouble();
account.deposit(depositAmount);
        
System.out.print("Enter amount to withdraw: ");
double withdrawAmount = sc.nextDouble();
 account.withdraw(withdrawAmount);

System.out.println("\n--- Final Account Details ---");
account.displayAccount();
        
        sc.close();
    }
}

