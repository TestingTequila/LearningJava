package Day26;

public interface C
{
    int MY_NUMBER=12;

    public  static void myProfile()
    {
        System.out.println("static method myProfile");
    }

    default void myName()
    {
        System.out.println("Interface myName");
    }
}
