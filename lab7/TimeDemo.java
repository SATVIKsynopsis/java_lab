class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;
    
    public void takeTime() throws HrsException, MinException, SecException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter hours: ");
        hours = scanner.nextInt();
        if (hours > 24 || hours < 0) {
            throw new HrsException("Invalid hours: " + hours + " (must be 0-24)");
        }
        
        System.out.print("Enter minutes: ");
        minutes = scanner.nextInt();
        if (minutes > 60 || minutes < 0) {
            throw new MinException("Invalid minutes: " + minutes + " (must be 0-60)");
        }
        
        System.out.print("Enter seconds: ");
        seconds = scanner.nextInt();
        if (seconds > 60 || seconds < 0) {
            throw new SecException("Invalid seconds: " + seconds + " (must be 0-60)");
        }
        
        scanner.close();
    }
    
    public void displayTime() {
        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time();
        
        try {
            time.takeTime();
            time.displayTime();
        } catch (HrsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MinException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (SecException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}