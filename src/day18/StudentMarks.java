package day18;

public class StudentMarks
{
    public int getStudentMarks(String studentName)
    {
        int marks=-1;

        if(studentName.equals("Neha"))
        {
            marks= 100;
        }
        else if (studentName.equals("Ravi"))
        {
            marks= 77;
        }
        else if (studentName.equals("Tom"))
        {
            marks= 0;
        }
        else if (studentName.equals("Jatin"))
        {
            marks= 54;
        }
        else if (studentName.equals("Sachin"))
        {
            marks= 98;
        }
        return marks;
    }
}
