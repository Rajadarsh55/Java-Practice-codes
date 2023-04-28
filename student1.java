//create custom exception -> student mark
//->raise exception if student is getting less than 50% marks, otherwise it will print the percentage of student.
class StudentMarksException extends Exception {
    public StudentMarksException(String message) {
        super(message);
    }}

class Student {
    private int subject1, subject2, subject3;

    public Student(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public void printPercentage() throws StudentMarksException {
        int totalMarks = subject1 + subject2 + subject3;
        double percentage = (double) totalMarks / 3;
        
        if (percentage < 50) {
            throw new StudentMarksException("Student failed in one or more subjects.");
        } else {
            System.out.println("Percentage: " + percentage);
 }}}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(80, 70, 90);
        Student student2 = new Student(30, 40, 50);

        try {
            student1.printPercentage();
        } catch (StudentMarksException e) {
            System.out.println(e.getMessage());
        }

        try {
            student2.printPercentage();
        } catch (StudentMarksException e) {
            System.out.println(e.getMessage());
}}}

