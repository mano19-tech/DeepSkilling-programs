import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements Image {
    private String filename;
    private static Map<String, RealImage> cache = new HashMap<>();

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        RealImage realImage = cache.get(filename);

        if (realImage == null) {
            realImage = new RealImage(filename); // lazy initialization
            cache.put(filename, realImage); // caching
        } else {
            System.out.println("Loaded from cache: " + filename);
        }

        realImage.display();
    }
}
