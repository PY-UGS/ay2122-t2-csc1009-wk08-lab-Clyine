import java.util.Scanner;

public class CheckingAccount {
    private String accountNo;
    private double balance;

    CheckingAccount(String no, double balance) {
        this.accountNo = no;
        this.balance = balance;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Amount to deposit: ");
            double x = s.nextDouble();
            if (x <= 0) {
                throw new Exception();
            }
            this.balance += x;
        } catch (Exception e) {
            System.out.println("Invalid input, deposit must be greater than 0.");
            deposit();
        }

    }

    public void withdraw() throws InsufficientFundsException, Exception {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Amount to withdraw: ");
            double x = s.nextDouble();
            if (x > this.balance) {

                throw new InsufficientFundsException(x);
            }
            
            if (x <= 0) {
                throw new Exception();
            }

            this.balance -= x;
            System.out.println("The balance after withdraw is: $" + String.format("%.2f", balance - x));

        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but your account is short by: $" + String.format("%.2f", e.getAmount() - this.balance));
            withdraw();
        } catch (Exception e) {
            System.out.println("Invalid input, deposit must be greater than 0.");
            withdraw();
        }

    }

}
