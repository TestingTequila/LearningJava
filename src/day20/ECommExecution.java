package day20;

public class ECommExecution
{
    public static void main(String[] args) {

        EcommApplication ec = new EcommApplication();
        ec.login().doSearch("Iphone", 10000)
                .addToCart("Iphone")
                  .doPayment("5345353", 435)
                    .logout();

        System.out.println("==================================");
        ec.login().logout();
        ec.login()
                .doSearch("MacBook", 20000, "Apple")
                .addToCart("MacBook")
                .logout();
    }
}
