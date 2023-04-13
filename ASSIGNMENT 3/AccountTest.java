import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter your account number: ");
            String accno = sc.nextLine();
            System.out.print("Enter initial balance: ");
            float balance = sc.nextFloat();
            Account account = new Account(name, accno, balance);
            System.out.print("Enter withdrawal amount: ");
            float cash = sc.nextFloat();
            account.withdraw(cash);
            System.out.print("Enter deposit amount: ");
            cash = sc.nextFloat();
            account.deposit(cash);
        } catch (NegativeAmountException | MinimumBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}

class Account {
    String name;
    String accno;
    float balance;

    public Account(String name, String accno, float balance) throws NegativeAmountException, MinimumBalanceException {
        if (balance < 0) {
            throw new NegativeAmountException("Initial balance cannot be negative");
        }
        if (balance < 1000) {
            throw new MinimumBalanceException("Initial balance should be at least 1000");
        }
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }

    public void withdraw(float cash) throws NegativeAmountException, MinimumBalanceException {
        if (cash < 0) {
            throw new NegativeAmountException("Withdrawal amount cannot be negative");
        }
        if (balance - cash < 1000) {
            throw new MinimumBalanceException("Insufficient balance");
        }
        balance -= cash;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    public void deposit(float cash) throws NegativeAmountException {
        if (cash < 0) {
            throw new NegativeAmountException("Deposit amount cannot be negative");
        }
        balance += cash;
        System.out.println("Deposit successful. New balance: " + balance);
    }
}
