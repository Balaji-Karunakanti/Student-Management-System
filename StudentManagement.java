public class StudentManagement {
    private Student students[];// array of students
    private int count;

    public StudentManagement(int size) {// to initialize the array size
        students = new Student[size];
        count = 0;
    }

    // to add each student to the array of students
    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
            System.out.println("Student added Successfully");
        } else {
            System.out.println("Student list is full");
        }
    }

    // to display all the available students in the list or array
    public void displayAll() {
        if (count == 0) {
            System.out.println("List is empty");
        } else {
            for (int i = 0; i < count; i++) {
                students[i].displayStudent();
            }
        }
    }

    public Student getStudent(int rollno) {
        for (int i = 0; i < count; i++) {
            if (students[i].getRoll_no() == rollno) {
                return students[i];
            }
        }
        return null;
    }
}
