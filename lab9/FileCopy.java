import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String src = sc.nextLine();

        System.out.print("Enter destination file name: ");
        String dest = sc.nextLine();

        FileReader fr = new FileReader(src);
        FileWriter fw = new FileWriter(dest);
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();

        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fis.close();
        fos.close();

        System.out.println("File Copied");
        sc.close();

