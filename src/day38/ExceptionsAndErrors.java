package day38;

public class ExceptionsAndErrors
{
    public static void main(String[] args) {
        int i =12;
        int j = 0;
        try {
             int divide = i / j;
             String name= null;
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


        System.out.println("Will this be printed ?");
    }
}

//RunTime Exceptions

//Exception Vs Errors
