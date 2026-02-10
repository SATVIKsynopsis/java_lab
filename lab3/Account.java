import java.util.Scanner;

class Account {
    int accNo;
    double balance;

    void input(Scanner sc) {
        accNo = sc.nextInt();
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar;

    void input(Scanner sc) {
        name = sc.next();
        aadhar = sc.nextLong();
        super.input(sc);
    }

    @Override
    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar: " + aadhar);
        super.disp();
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] p = new Person[3];

        for (int i = 0; i < 3; i++) {
            p[i] = new Person();
            System.out.print("Enter name aadhar accNo balance: ");
            p[i].input(sc);
        }

        for (int i = 0; i < 3; i++) {
            p[i].disp();
            System.out.println();
        }

        sc.close();
    }
}
