package day18;

public class ExecutingStudents
{
    public static void main(String[] args) {
        StudentMarks sm = new StudentMarks();
        int marks= sm.getStudentMarks("Jatin");
        if(marks>75)
        {
            System.out.println("Student has scored Distinction marks");
        }
        else
        {
            System.out.println("Below distinction marks...");
        }
    }
}
