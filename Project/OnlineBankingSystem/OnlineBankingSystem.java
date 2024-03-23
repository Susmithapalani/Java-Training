import java.util.Scanner;

class Account {
private String accountNumber;
private double balance;
private String customerName;
private int pin;


public Account(String accountNumber, double balance, String customerName, int pin) {
this.accountNumber = accountNumber;
this.balance = balance;
this.customerName = customerName;
this.pin = pin;
}



public String getAccountNumber() {
return accountNumber;
}

public void setAccountNumber(String accountNumber) {
this.accountNumber = accountNumber;
}

public double getBalance() {
return balance;
}

public void setBalance(double balance) {
if (balance >= 0) {
this.balance = balance;
} else {
System.out.println("Invalid balance amount.");
}
}

public String getCustomerName() {
return customerName;
}

public void setCustomerName(String customerName) {
if (customerName != null && !customerName.isEmpty()) {
this.customerName = customerName;
} else {
System.out.println("Invalid customer name.");
}
}

public int getPin() {
return pin;
}

public void setPin(int pin) {
if (String.valueOf(pin).length() == 4) {
this.pin = pin;
} else {
System.out.println("Invalid PIN. It must be a 4-digit number.");
}
}

// Operations

public void checkBalance() {
System.out.println("Current Balance: $" + balance);
}

public void deposit(double amount, int pin) {
if (this.pin == pin) {
balance += amount;
System.out.println("$" + amount + " deposited successfully.");
} else {
System.out.println("Incorrect PIN. Deposit failed.");
}
}

public void withdraw(double amount, int pin) {
if (this.pin == pin) {
if (balance >= amount) {
balance -= amount;
System.out.println("$" + amount + " withdrawn successfully.");
} else {
System.out.println("Insufficient balance.");
}
} else {
System.out.println("Incorrect PIN. Withdrawal failed.");
}
}
}

public class OnlineBankingSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


Account account = new Account("6736578", 4567.0, "Susmi", 7890);


System.out.println("Welcome to Online Banking System");
System.out.println("Account Holder: " + account.getCustomerName());
System.out.println("Account Number: " + account.getAccountNumber());

while (true) {
System.out.println("\nSelect an option:");
System.out.println("1. Check Balance");
System.out.println("2. Deposit Money");
System.out.println("3. Withdraw Money");
System.out.println("4. Exit");

int option = scanner.nextInt();

switch (option) {
case 1:
account.checkBalance();
break;

case 2:
System.out.print("Enter amount to deposit: $");
double depositAmount = scanner.nextDouble();
System.out.print("Enter PIN: ");
int depositPin = scanner.nextInt();
account.deposit(depositAmount, depositPin);
break;

case 3:
System.out.print("Enter amount to withdraw: $");
double withdrawAmount = scanner.nextDouble();
System.out.print("Enter PIN: ");
int withdrawPin = scanner.nextInt();
account.withdraw(withdrawAmount, withdrawPin);
break;

case 4:
System.out.println("Thank you for using Online Banking System. Goodbye!");
System.exit(0);
default:
System.out.println("Invalid option. Please try again.");
}
}
}
}
