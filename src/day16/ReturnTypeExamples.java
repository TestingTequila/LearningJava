package day16;

import com.sun.source.tree.BreakTree;

public class ReturnTypeExamples
{
    public  int getStudentMarks(String studentName)
    {
        int marks=-1;
        if(studentName.equals("Jason"))
        {
            marks =100;
        }

        if(studentName.equals("Kerrie"))
        {
            marks=90;
        }

        if(studentName.equals("Lee"))
        {
            marks=80;
        }

        if(studentName.equals("Priya"))
        {
            marks =95;
        }

        if(studentName.equals("Ben"))
        {
            marks =0;
        }

        return  marks;
    }


}
