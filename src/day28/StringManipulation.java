package day28;

import java.util.Arrays;

public class StringManipulation
{
   public static void main(String[] args) {
      String str = "This is my Java Code";
      System.out.println("BEFORE SPLIT: "+str.length());
      System.out.println("===============================split()============================");
      String[] myWord= str.split(" ");
      System.out.println("AFTER SPLIT: "+myWord.length);
      System.out.println(Arrays.toString(myWord));






















      System.out.println(str.length());
      int li =0;
      int hi = str.length()-1;
      System.out.println("Lowest Index: "+li); //0
      System.out.println("Highest Index: "+ hi); //20-1 =19
      System.out.println("====================charAt(index)");
      //charAt(index): To know the character stored at any index in a String variable

      System.out.println(str.charAt(0));//T
      System.out.println(str.charAt(6));//s
      System.out.println(str.charAt(16));//C
      System.out.println(str.charAt(19));//e
      //System.out.println(str.charAt(20));//SIOB Exception
      if(str.charAt(11)=='J')
      {
         System.out.println("This is Java");
      }
      System.out.println("===============================indexOf(char)====================");
      System.out.println(str.indexOf('T')); //0
      System.out.println(str.indexOf('s')); //3
      System.out.println(str.indexOf('e')); //19
      System.out.println(str.indexOf('Z')); //-1
      System.out.println(str.indexOf(' '));

      String m1 = "Hello, Ankita";
      System.out.println(m1.contains("Ankita")); // true
      if(m1.indexOf("Ankita")==7)
      {
         System.out.println("Ankita logged in");
      }
      else
      {
         System.out.println("Ankita is not logged in");
      }

      System.out.println(str.indexOf('i'));
      System.out.println(str.indexOf('i', str.indexOf('i')+1));

      System.out.println("===================trim()===================================");

      String p = "     hello World  ";
      System.out.println(p.trim());

      if(p.trim().indexOf("hello")==0)
      {
         System.out.println("this is hello world");
      }
      else
      {
         System.out.println("This is not hello world");
      }

      System.out.println("====================================replace()=================================");
      System.out.println(p.replace(" ", ""));

      String dob = "25-12-1996"; // 25/12/1996
      System.out.println(dob.replace("-", "/"));
      String[] myDob=dob.split("-");
      System.out.println(Arrays.toString(myDob));
      System.out.println(myDob.length);

      String word = "I Hate Java";
      System.out.println(word.replace("Hate", "Love"));

      System.out.println("===========================equals()=========================================");
      String words = "I Love Java";
      System.out.println(word.trim().replace("Hate", "Love").equals(words));

      System.out.println("=====================contains()=================================");
      System.out.println(word.contains("Java"));

      if(word.indexOf("Java")==7)
      {
         System.out.println("True");
      }
      else {
         System.out.println("False");
      }

      System.out.println(word.indexOf('J'));

      System.out.println("==========================split===============================");


   }


}


