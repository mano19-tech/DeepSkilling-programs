import java.util.ArrayList;
public class Inventory {


    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product);
    }

    public void updateProduct(String productId, String name, int quantity, double price) {
        boolean found = false;
        for (Product p : products) {
            if (p.getProductId().equals(productId)) {
                p.setProductName(name);
                p.setQuantity(quantity);
                p.setPrice(price);
                System.out.println("Product updated: " + p);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found with ID: " + productId);
        }
    }

    public void deleteProduct(String productId) {
        boolean removed = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId().equals(productId)) {
                System.out.println("Product deleted: " + products.get(i));
                products.remove(i);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Product not found with ID: " + productId);
        }
    }

    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("Current Inventory:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}


