import com.example.EvenChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenCheckerTest {
    @Test
    void testIsEven() {
        assertTrue(new EvenChecker().isEven(2));
    }
}
