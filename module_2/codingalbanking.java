
class BankAccount {

    // Private data members (Encapsulation)
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor
    BankAccount(String name, int number, double amount) {
        accountHolder = name;
        accountNumber = number;
        balance = amount;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("\n--- Codingal Banking Services ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Available Balance: " + balance);
    }

    public static void main(String[] args) {

        // Creating bank account object
        BankAccount obj = new BankAccount("Aman", 1001, 5000);

        // Display account details
        obj.displayDetails();

        // Perform banking operations
        obj.deposit(2000);
        obj.withdraw(1500);

        // Display updated balance
        obj.displayDetails();
    }
}
