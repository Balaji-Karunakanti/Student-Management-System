
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Students:");
        int no = scan.nextInt(); // for number of students
        scan.nextLine();
        StudentManagement sm = new StudentManagement(no);

        while (true) {
            System.out.println("Enter a option from the below menu");
            System.out.println("1. Add Student");
            System.out.println("2. Search by Student Roll Number");
            System.out.println("3. Update Student Details");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.println("Your choice");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    int roll_no;
                    while (true) {

                        System.out.println("Enter Roll No (1-100)");
                        roll_no = scan.nextInt();
                        scan.nextLine();

                        if (roll_no > 0 && roll_no <= 100) {
                            break;
                        } else {
                            System.out.println(" Invalid ! Enter a valid Roll  Number between 1 and 100");
                        }
                    }
                    System.out.println("Enter your name :");
                    String name = scan.nextLine();
                    System.out.println("Enter your age ");
                    int age = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter your grade ");
                    String grade = scan.nextLine();
                    Student s = new Student(roll_no, name, age, grade);
                    sm.addStudent(s);
                    break;
                case 2:
                    System.out.println("Enter Roll No to retrieve details");
                    int rollno = scan.nextInt();
                    scan.nextLine();
                    Student found = sm.getStudent(rollno);
                    if (found != null) {
                        found.displayStudent();
                    } else {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 3:
                    System.out.println("Enter Roll No to update student details");
                    int rollnumber = scan.nextInt();
                    scan.nextLine();
                    Student found1 = sm.getStudent(rollnumber);
                    if (found1 != null) {
                        System.out.println("What should be updated?");
                        System.out.println("1. Name");
                        System.out.println("2. Age");
                        System.out.println("3. Grade");
                        int select = scan.nextInt();
                        scan.nextLine();

                        if (select == 1) {
                            System.out.println("Enter New Name:");
                            String newName = scan.nextLine();
                            found1.setName(newName);
                        } else if (select == 2) {
                            System.out.println("Enter New Age:");
                            int newAge = scan.nextInt();
                            scan.nextLine();
                            found1.setAge(newAge);
                        } else if (select == 3) {
                            System.out.println("Enter New Grade:");
                            String newGrade = scan.nextLine();
                            found1.setGrade(newGrade);
                        } else {
                            System.out.println("Invalid Option");
                        }
                    } else {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 4:
                    sm.displayAll();
                    break;

                case 5:
                    System.out.println("Exiting program");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");

            }

        }
    }
}
