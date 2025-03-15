package day38;

public class ExceptionsAndFinally
{
    public static void main(String[] args) {
        int i =12;
        int j = 4;
        try {
             int divide = i / j;
             String name= "Ashish";
            System.out.println(name.length());
        }

        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }

        catch (IndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }

        catch (NullPointerException e)
        {
            e.printStackTrace();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

        finally {
            System.out.println("I will always execute ....");
        }

        System.out.println("Will this be printed ?");
    }
}

//RunTime Exceptions

//Exception Vs Errors
