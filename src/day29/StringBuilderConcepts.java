package day29;

public class StringBuilderConcepts
{
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Selenium");
        sb.append(" Automation");
        System.out.println(sb);

        StringBuffer sf = new StringBuffer("Java");
        sf.append(" Programming");
        System.out.println(sf);


//        String s1 = "  Ashish";
//        System.out.println(s1); //  Ashish
//        s1.trim();//Ashish
//        System.out.println(s1); //  Ashish
//
//        String ss = "Janbask";
//        ss.concat("QA Training");
//        System.out.println(ss); // Janbask
    }
}
