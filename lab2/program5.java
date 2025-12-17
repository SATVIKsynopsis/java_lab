import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
}

class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];
        double minCgpa;
        int index = 0;

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.print("Enter Roll: ");
            s[i].roll = sc.nextInt();
            System.out.print("Enter Name: ");
            s[i].name = sc.next();
            System.out.print("Enter CGPA: ");
            s[i].cgpa = sc.nextDouble();
        }

        minCgpa = s[0].cgpa;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < minCgpa) {
                minCgpa = s[i].cgpa;
                index = i;
            }
        }

        System.out.println("\nStudent Details:");
        for (Student st : s) {
            System.out.println(st.roll + " " + st.name + " " + st.cgpa);
        }

        System.out.println("\nStudent with lowest CGPA: " + s[index].name);
    }
}
