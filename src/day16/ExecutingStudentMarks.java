package day16;

public class ExecutingStudentMarks
{
    public static void main(String[] args) {
        ReturnTypeExamples rte = new ReturnTypeExamples();
        int marks =rte.getStudentMarks("Emma");
        System.out.println("Marks: " + marks);


        SeleniumExample se = new SeleniumExample();
        String browser=se.launchBrowser("Chrome");
        System.out.println("Launching: " + browser);

        String name =se.myName();
        System.out.println(name);
    }

}
