import java.util.Scanner;

class Plastic2D {
    protected double length;
    protected double breadth;

    Plastic2D(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateCost() {
        double area = length * breadth;
        return area * 40; 
    }
}

class Plastic3D extends Plastic2D {
    private double height;

    
    Plastic3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    @Override
    double calculateCost() {
        double volume = length * breadth * height;
        return volume * 60; 
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Plastic Sheet (2D)");
        System.out.println("2. Plastic Box (3D)");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter breadth: ");
            double b = sc.nextDouble();

            Plastic2D sheet = new Plastic2D(l, b);
            System.out.println("Cost of plastic sheet = Rs " + sheet.calculateCost());
        } 
        else if (choice == 2) {
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter breadth: ");
            double b = sc.nextDouble();
            System.out.print("Enter height: ");
            double h = sc.nextDouble();

            Plastic3D box = new Plastic3D(l, b, h);
            System.out.println("Cost of plastic box = Rs " + box.calculateCost());
        } 
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
