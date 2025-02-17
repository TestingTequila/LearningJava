package day22;

public class ECommerceApp {
    String name; //Justin

    ECommerceApp(String name) {
        this.name = name;
    }

    public ECommerceApp login() {
        System.out.println("Login to app");
        return new ECommerceApp("Jason");
    }

    public ECommerceApp doLogin(String email, String pwd) {
        System.out.println("Login to app using email as: " + email + " and Password as: " + pwd);
//        return this;
        return new ECommerceApp("Jason");
    }

    public ECommerceApp doSearch(String productName) {
        System.out.println("Searching... using product name as: " + productName);
//        return this;
        return new ECommerceApp("Jason");
    }

    public ECommerceApp doSearch(String productName, double price) {
        System.out.println("Searching... using product name as: " + productName + " and Price as: " + price);
        return this;
    }

    public ECommerceApp doSearch(String productName, double price, String brandName) {
        System.out.println("Searching... using product name as: " + productName + " and Price as: " + price + " and brand name as " + brandName);
        return this;
    }

    public  ECommerceApp doAddToCard(String productName)
    {
        System.out.println("Adding the product " + productName + " into the Cart...");
//        return this;
        return new ECommerceApp("Jason");
    }

    public  ECommerceApp doPayment(long ccNumber, int cvv)
    {
        System.out.println("Payment using " + ccNumber + " and cvv as " + cvv);
        return this;
    }

    public  ECommerceApp doPayment(String upi)
    {
        System.out.println("Payment using " + upi);
        return this;
    }

    public  ECommerceApp getOrderId()
    {
        System.out.println("4234#$%#$%4554"+ name);
        return this;
    }

    public  ECommerceApp logout()
    {
        System.out.println("Logging out from App...");
        return this;
    }
}
