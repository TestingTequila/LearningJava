package day27;

public class StringImmutable {
    public static void main(String[] args) {
        String s1 = "selenium"; //Literals
//        System.out.println(s1.toUpperCase());//SELENIUM
//        System.out.println(s1);//selenium

        String s2 = new String("selenium");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = "selenium";
        System.out.println(s1.equals(s3));

        String str = new String("Testing");
        String str1 = new String("Testing");

        System.out.println(str==str1);
        System.out.println(str.equals(str1));

        String str2= "Testing";
        System.out.println(str2.equals(str1));

        String str3= "Testing";
        System.out.println(str2==str3);//true
        System.out.println(str2.equals(str3));


    }
}


//String is immutable