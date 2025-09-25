import java.util.*;

class Student {
    String name;
    int rollNumber;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNumber + ", Name: " + name + ", Grade: " + grade;
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    if (name.isEmpty() || grade.isEmpty() || roll <= 0) {
                        System.out.println("Invalid input! Try again.");
                    } else {
                        students.add(new Student(name, roll, grade));
                        System.out.println("Student added!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Roll Number to remove: ");
                    int removeRoll = sc.nextInt();
                    boolean removed = students.removeIf(s -> s.rollNumber == removeRoll);
                    System.out.println(removed ? "Student removed!" : "Student not found!");
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = sc.nextInt();
                    Student found = null;
                    for (Student s : students) {
                        if (s.rollNumber == searchRoll) {
                            found = s;
                            break;
                        }
                    }
                    System.out.println(found != null ? "Found: " + found : "Student not found!");
                    break;

                case 4:
                    if (students.isEmpty()) {
                        System.out.println("No students to display!");
                    } else {
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
