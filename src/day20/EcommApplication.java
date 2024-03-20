package day20;

public class EcommApplication
{
    public EcommApplication login()
    {
        System.out.println("Login To app");
        return this;
    }

    public EcommApplication login(String un, String pwd)
    {
        System.out.println("Login To app" + un + " : " + pwd);
        return this;
    }

    public  EcommApplication doSearch(String productName)
    {
        System.out.println("Search Product: " + productName);
        return this;
    }

    public  EcommApplication doSearch(String productName, int price)
    {
        System.out.println("Search Product: " + productName + " and price :" + price);
        return this;
    }

    public  EcommApplication doSearch(String productName, int price, String  brand)
    {
        System.out.println("Search Product: " + productName + " and price :" + price + " and brand: " + brand);
        return this;
    }

    public EcommApplication doPayment(String cc, int cvv)
    {
        System.out.println(" making payment using: " + cc + " and cvv " + cvv);
        return this;
    }

    public EcommApplication doPayment(String payPalId, String password)
    {
        System.out.println(" making payment using: " + payPalId + " and cvv " + password);
        return this;
    }

    public EcommApplication addToCart(String productName)
    {
        System.out.println("Added to Cart: " + productName);
        return this;
    }

    public  EcommApplication generateOrder()
    {
        System.out.println("Your order id is : " + 645665);
        return this;
    }

    public  EcommApplication logout()
    {
        System.out.println(" Logout from application");
        return this;
    }
}
