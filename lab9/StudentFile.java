import java.io.*;
import java.util.Scanner;

public class StudentFile {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        FileWriter fw = new FileWriter(fileName, true);
        fw.write("Roll No: " + roll + "\n");
        fw.write("Name: " + name + "\n");
        fw.write("Subject: " + subject + "\n");
        fw.write("Marks: " + marks + "\n\n");
        fw.close();

        FileReader fr = new FileReader(fileName);
        int ch;
        System.out.println("\nFile Content:");
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();

        sc.close();
    }
}
