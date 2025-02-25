package day27;

public class StringBufferConcept
{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Selenium");
        System.out.println(sb.append("Concept"));
        System.out.println(sb);

        StringBuilder sbr = new StringBuilder("Java");
        sbr.append(" Language");
        System.out.println(sbr);
    }

}
