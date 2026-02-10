public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        
        System.out.println("Attempting to divide " + numerator + " by " + denominator);
        
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            System.out.println("Cannot divide by zero!");
            
        } finally {
            System.out.println("Finally block executed - Cleanup operations completed");
        }
        
        System.out.println("Program continues after exception handling");
    }
}
