class SubtractDemo {

    int subtract(int a, int b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        SubtractDemo s = new SubtractDemo();

        System.out.println("Subtract 2 numbers: " + s.subtract(10, 5));
        System.out.println("Subtract 3 numbers: " + s.subtract(20, 5, 3));
        System.out.println("Subtract doubles: " + s.subtract(10.5, 2.5));
    }
}
