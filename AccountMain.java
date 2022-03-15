public class AccountMain {
    public static void main(String[] args) throws InsufficientFundsException, Exception{
        CheckingAccount acc = new CheckingAccount("11111", 0);
        acc.deposit();
        acc.withdraw();
        acc.withdraw();
    }
}
