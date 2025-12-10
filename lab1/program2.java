

public class program2 {
    public static void main(String[] args) {
        int marks = 30;  
        char grade;

        if (marks >= 90)
            grade = 'O';
        else if (marks >= 80)
            grade = 'E';
        else if (marks >= 70)
            grade = 'A';
        else if (marks >= 60)
            grade = 'B';
        else if (marks >= 50)
            grade = 'C';
        else
            grade = 'F';

        System.out.println("Grade: " + grade);
    }
}
