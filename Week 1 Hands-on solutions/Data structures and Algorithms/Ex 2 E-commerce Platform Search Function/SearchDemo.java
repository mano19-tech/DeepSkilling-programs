import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    // Inner Product class
    static class Product {
        int productId;
        String productName;
        String category;

        Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        @Override
        public String toString() {
            return productId + " - " + productName + " (" + category + ")";
        }
    }

    // Linear Search
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search (array must be sorted by productName)
    public static Product binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(name);

            if (compare == 0) return products[mid];
            else if (compare < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }

    // Main method to test the search
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shirt", "Clothing"),
                new Product(3, "Book", "Education"),
                new Product(4, "Headphones", "Electronics"),
                new Product(5, "Shoes", "Footwear")
        };

        System.out.println("Linear Search for 'Shoes':");
        Product result1 = linearSearch(products, "Shoes");
        System.out.println(result1 != null ? result1 : "Product not found.");

        // Sort products before binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println("Binary Search for 'Laptop':");
        Product result2 = binarySearch(products, "Laptop");
        System.out.println(result2 != null ? result2 : "Product not found.");
    }
}
