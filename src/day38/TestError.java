package day38;

public class TestError {
    public static void main(String[] args) {
        StackOverflow sof = new StackOverflow();
        try {
            sof.m1();
        } catch (Error e)
        {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" Will this be printed....");
    }
}
