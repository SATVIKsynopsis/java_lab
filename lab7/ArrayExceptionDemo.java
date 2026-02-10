import java.util.Scanner;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[4];
        
        System.out.println("Enter the numbers (Example: 1 2 3 4 5): ");
        
        try {
            String input = scanner.nextLine();
            String[] inputNumbers = input.split(" ");
            
            for (int i = 0; i < inputNumbers.length; i++) {
                numbers[i] = Integer.parseInt(inputNumbers[i]);
            }
            
            System.out.println("All numbers stored successfully!");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        
        scanner.close();
    }
}
