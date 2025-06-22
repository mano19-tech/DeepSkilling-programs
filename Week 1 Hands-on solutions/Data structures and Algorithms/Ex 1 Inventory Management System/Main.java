//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product p1 = new Product("101", "Monitor", 20, 12000.0);
        Product p2 = new Product("102", "Keyboard", 40, 800.0);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.displayInventory();

        inventory.updateProduct("102", "Mechanical Keyboard", 50, 1200.0);
        inventory.deleteProduct("101");

        inventory.displayInventory();


    }
}