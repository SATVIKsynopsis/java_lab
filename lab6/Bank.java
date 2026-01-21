class Bank {

    double rate = 5.0;

    static class InterestCalculator {

        static double calculateSI(double principal, double rate, double time) {
            return (principal * rate * time) / 100;
        }

        static void showAccessIssue() {

            System.out.println("Static nested class cannot access non-static members directly.");
        }
    }

    public static void main(String[] args) {

        double principal = 1000;
        double rate = 5;
        double time = 2;

        double si = Bank.InterestCalculator.calculateSI(principal, rate, time);

        System.out.println("Simple Interest = " + si);

        Bank.InterestCalculator.showAccessIssue();

        Bank b = new Bank();
        System.out.println("Accessing non-static member using object: " + b.rate);
    }
}
