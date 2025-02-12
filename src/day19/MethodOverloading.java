package day19;

public class MethodOverloading
{

    public  void addition()
    {

    }

    public void addition(int a, int b)
    {

    }

    public int addition(int a, char b)
    {
         return a;
    }

    public void addition(int a, int b, int c)
    {

    }


    public void addition(float a, int b)
    {

    }

    public void addition(float a, double b)
    {

    }

    public void addition(float c, long d)
    {

    }

    public void addition(long c, float d)
    {

    }
    //Examples:
    //Login
    //email, password
    //gmail, facebook
    //mobileNumber, Otp
    // email, password, Otp

    public void login(String email, String password)
    {

    }

    public void login(String gmailApi)
    {

    }

    public void login(long mobileNumber, int Otp)
    {

    }

    public void login(String email, String password, int otp)
    {

    }


    //Payment
      //Credit card, cvv
      //googlePay
      //debit card, pin
      //crypto

    public  void payment(long ccNumber, int cvv)
    {

    }

    public  void payment(int Gpay)
    {

    }

    public  void payment(int debitCardNumber, int pin)
    {

    }

    public  void payment(String cryptoId)
    {

    }

    //Search
    public  void searchProduct(String brands)
    {

    }

    public  void searchProduct(int price)
    {

    }

    public  void searchProduct(int price, String brand)
    {

    }

    public  void searchProduct(int price, String brand, String CellularTech)
    {

    }

    public  void searchProduct(int price, String brand, double screenSize)
    {

    }

    public void performAction(String topArrowKey)
    {

    }

    public void performAction(String topArrowKey, String bottomKey)
    {

    }

    public void performAction(String topArrowKey, String bottomKey, int num)
    {

    }


}

//OOPS: Object Oriented Programming
        //Polymorphism [Many + Forms]
             //-Method Overloading [static Polymorphism/ compile Time Polymorphism]
                //=========================================
//Method overloading[Same name, different signature]
//a) This happens within the same class

//Signature different:
//1. dataType of parameters change
//2. by changing the count of signature
//3. by changing the order of signature
                //=========================================


             //-Method Overriding
        //Encapsulation
           //-DataHiding
        //Inheritance
          //-Abstraction
          //-Interface




