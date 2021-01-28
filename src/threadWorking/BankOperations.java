package threadWorking;

public class BankOperations {
    public static void main(String[] args) throws InsufficientFundsException {
        final BankAccount a = new BankAccount(1000);
        final BankAccount b = new BankAccount(2000);

        new Thread(() -> {
            try {
                transfer(a, b, 500);
            } catch (InsufficientFundsException e) {
                e.printStackTrace();
            }
        }).start();
        transfer(b, a, 300);
    }

    static synchronized void transfer(BankAccount account1, BankAccount account2, int amount)
            throws InsufficientFundsException {
        if (account1.getBalance() < amount) {
            throw new InsufficientFundsException("Error");
        }
        account1.withdraw(amount);
        account2.deposit(amount);
        System.out.println("transfer done " + account1.getBalance() + " " + account2.getBalance());

    }
}
