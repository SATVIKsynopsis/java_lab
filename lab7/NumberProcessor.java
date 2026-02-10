class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class NumberProcessor {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        
        try {
            processor.ProcessInput();
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
    
    public void ProcessInput() throws NegativeNumberException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            throw new NegativeNumberException("Negative number entered");
        } else {
            System.out.println("Double value: " + (number * 2));
        }
        
        scanner.close();
    }
}