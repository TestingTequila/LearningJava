package day27;

import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "  HI THIS IS PYTHON CODE   ";
        String str1 = "hi this is java code";
//        System.out.println(str.length());
        //li =0;
        //hi =length -1

//        //1. charAt(index)
//        System.out.println(str.charAt(22));
//        //indexOf(Char)
//        System.out.println(str.indexOf('H'));
//        System.out.println(str.indexOf("java"));
//        if(str.indexOf("java")!=-1)
//        {
//            System.out.println("Java is found...");
//        }

        System.out.println(str.indexOf('i'));
        System.out.println(str.indexOf('i', str.indexOf('i') + 1));
        System.out.println(str.indexOf('i', str.indexOf('i') + 5));

        //3. toLowerCase()
        System.out.println(str.toLowerCase());
        //4. ToUpperCase
        System.out.println(str1.toUpperCase());

        //5. trim()
        System.out.println(str);
        System.out.println(str.trim());

        //6. replace()
        String str2 = "Hello Sir";//Hello,Sir
        System.out.println(str2.replace("Hel", "Bo"));
        String dob = "25-12-1989";
        System.out.println(dob.replace("-", "/"));

        //equals
        String str5 = "HELLO";
        String str6 = "Hello";
        System.out.println(str5.equals(str6));
        System.out.println(str5.equals(str6.toUpperCase()));

        //contains
        String name = "My name is Anthony";
        System.out.println(name.contains("John"));

        //split
        String programmingLanguage = "JAVA_C#_PYTHON_RUBY";
        System.out.println(programmingLanguage.length()); //


        String[] myLang = programmingLanguage.split("_");
        System.out.println(myLang.length);//4
        System.out.println(Arrays.toString(myLang));
        for (String str0 : myLang) {
            System.out.println(str0);
        }

        String pop = "xXtestingxXseleniumXxXautomationXXxXTrainingX";
        String[] myPop = pop.split("xX");
        System.out.println(Arrays.toString(myPop));
        System.out.println(myPop.length);
    }
}
