class Account {
    static int nextAccNo = 1001;

    int accNo;
    String name, type;
    double balance;
    int day, month, year;

    Account(String name, String type, double balance, int d, int m, int y) {
        this.accNo = nextAccNo++;
        this.name = name;
        this.type = type;
        this.balance = balance;
        day = d; month = m; year = y;
    }

    void checkBalance() {
        System.out.println("Balance: Rs " + balance);
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited Rs " + amt);
    }

    void withdraw(double amt) {
        System.out.println("Withdrawal not defined");
    }
}

class StandardAccount extends Account {

    StandardAccount(String name, double bal, int d, int m, int y) {
        super(name, "Standard", bal, d, m, y);
    }

    @Override
    void withdraw(double amt) {
        if (amt <= 100000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt + " (No charge)");
        } 
        else if (amt <= 500000) {
            double penalty = amt * 0.0005;
            balance -= (amt + penalty);
            System.out.println("Withdrawn Rs " + amt + " with penalty Rs " + penalty);
        } 
        else {
            System.out.println("Limit exceeded for Standard Account");
        }
    }
}

class PremiumAccount extends Account {

    PremiumAccount(String name, double bal, int d, int m, int y) {
        super(name, "Premium", bal, d, m, y);
    }

    @Override
    void withdraw(double amt) {
        if (amt <= 1000000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt);
        } else {
            System.out.println("Daily limit exceeded for Premium Account");
        }
    }
}


public class BankDemo {
    public static void main(String[] args) {

        Account acc;

        acc = new StandardAccount("Rahul", 800000, 10, 8, 2025);
        acc.checkBalance();
        acc.withdraw(200000);
        acc.checkBalance();

        System.out.println();

        acc = new PremiumAccount("Anita", 2000000, 12, 8, 2025);
        acc.checkBalance();
        acc.withdraw(900000);
        acc.checkBalance();
    }
}
