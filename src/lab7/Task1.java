package lab7;

public class Task1 {
    static class BankAccount {
        private String accountNumber;
        private double balance;

        BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            if (balance >= 0) {
                this.balance = balance;
            }
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345678", 1000);
        account.deposit(500);
        account.withdraw(300);
        System.out.println("Поточний баланс: " + account.getBalance());
    }
}
