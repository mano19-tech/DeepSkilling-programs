//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(101, "A Tale of Two Cities", " Charles Dickens"),
                new Book(102, "The Lord of the Rings", "J R R Tolkien"),
                new Book(103, "Harry Potter", "J K Rowling")
        };

        Book foundLinear = LinearSearch.linearSearch(books, "Harry Potter");
        System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear : "Not Found"));

        Book foundBinary = BinarySearch.binarySearch(books, "A Tale of Two Cities");
        System.out.println("Binary Search Result: " + (foundBinary != null ? foundBinary : "Not Found"));

    }
}