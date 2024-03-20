package day20;

public class ExecutingRegister
{
    public static void main(String[] args) {
        RegisterPage rp = new RegisterPage("Jason", 29, "London", "25/12/1999"); // Setting
        rp.setAge(25); // Updating
        System.out.println("NAME: " + rp.getName() + ", AGE: " + rp.getAge() + ", ADDRESS:" + rp.getAddress()+ ", DOB: " + rp.getDob());
    }
}
