class University {

    String universityName;
    String location;

    University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    class Department {
        String deptName;
        String hodName;

        Department(String deptName, String hodName) {
            this.deptName = deptName;
            this.hodName = hodName;
        }

        void displayDetails() {
            System.out.println("University Name: " + universityName);
            System.out.println("Location: " + location);

            // Inner class data
            System.out.println("Department Name: " + deptName);
            System.out.println("HOD Name: " + hodName);
        }
    }

    public static void main(String[] args) {

        University u = new University("KIIT University", "Bhubneswar");

        University.Department d = u.new Department("Computer Science", "N. Biraja Issac");

        d.displayDetails();
    }
}
