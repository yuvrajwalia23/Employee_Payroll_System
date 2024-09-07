
import java.util.Scanner;

class ATM {

    float balance;
    int PIN = 4455;

    public void checkPin() {
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if (enteredPin == PIN) { // default pin is 4455
            menu();
        } else {
            System.out.println("Invalid Pin entered!");
            checkPin();
        }
    }

    public void menu() {
        System.out.println("Enter your choice : ");
        System.out.println("1. Check A/C Balance : ");
        System.out.println("2. Withdraw Money : ");
        System.out.println("3. Deposit Money : ");
        System.out.println("4. Exit : ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1 ->
                checkBalance();
            case 2 ->
                withdrawMoney();
            case 3 ->
                depositMoney();
            case 4 -> {
                return;
            }
            default ->
                System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Money Withdrawl Successful");
        }

        menu();
    }

    public void depositMoney() {
        System.out.println("Enter Amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Money Deposited Successful");
        menu();
        sc.close();
    }
}

public class ATMMachine {

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
    }
}
