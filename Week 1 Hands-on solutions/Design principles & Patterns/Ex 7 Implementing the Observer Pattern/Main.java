//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileUser1 = new MobileApp("Guru");
        Observer mobileUser2 = new MobileApp("Shabi");
        Observer webUser = new WebApp("Jackie");

        market.registerObserver(mobileUser1);
        market.registerObserver(mobileUser2);
        market.registerObserver(webUser);

        System.out.println("Setting stock price to $120.50...");
        market.setStockPrice(120.50);

        System.out.println("\nRemoving Bob's MobileApp...\n");
        market.removeObserver(mobileUser2);

        System.out.println("Setting stock price to $130.75...");
        market.setStockPrice(130.75);
    }
}