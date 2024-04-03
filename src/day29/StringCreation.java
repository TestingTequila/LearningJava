package day29;

public class StringCreation {
    public static void main(String[] args) {

        System.out.println("=====================String Literals==========================");
        String str = "Selenium"; //1
        String str1 = "Selenium";// 0
        String str2 = "selenium"; //1

        System.out.println(str == str1);// true
        System.out.println(str.equals(str1)); //true

        System.out.println(str == str2);//false
        System.out.println(str.equals(str2)); //false

        System.out.println("=======================================new Keyword=======================");

        String s1 = new String("Testing"); //2
        String s2 = new String("Testing"); //1
        String s3 = "Testing"; //0
        String s4 = "Testing"; //0

        System.out.println(s3==s4); // true
        System.out.println(s3.equals(s4));//true

        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2));// true

        System.out.println(s1==s3);// false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3==s4); //true

        String s5 ="testing";
        String s6 = new String("testing");

        System.out.println(s1==s6); //false
        System.out.println(s1.equals(s6));//false

        String s11 = new String("Test");
        String s22 = new String("Test");
        s11=s22;
        System.out.println(s11==s22); //true
        System.out.println(s11.equals(s22));//true

        String s7= "Java";
        s7=null;
        System.out.println(s7.length());
    }
}
