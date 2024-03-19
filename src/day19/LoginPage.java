package day19;

public class LoginPage {
    String username;
    String password; //1111

    public  LoginPage(String username, String password)
    {
        this.username=username;
        this.password =password;
    }

    public void doLogin()
    {
        System.out.println("Entering the username: " + username);
        System.out.println("Entering the password: " + password);
        System.out.println("Click on login Button");
        System.out.println("User is logged In....");
    }

    public LoginPage(String password)
    {
        this.password = password;
    }
}


