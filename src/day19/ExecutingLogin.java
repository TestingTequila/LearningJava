package day19;

public class ExecutingLogin
{
    public static void main(String[] args) {
        LoginPage lp = new LoginPage("Jason2522", "test@4321");
        lp.doLogin();

        System.out.println("==================================");
        LoginPage lp1 = new LoginPage("test@1111");
        lp1.doLogin();
    }
}
