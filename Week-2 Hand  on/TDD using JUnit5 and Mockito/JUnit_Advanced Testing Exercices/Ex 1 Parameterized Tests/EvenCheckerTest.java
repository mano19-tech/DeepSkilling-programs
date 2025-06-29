import com.example.EvenChecker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class EvenCheckerTest {

    EvenChecker checker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 0, -2, -4})
    void testIsEven_WithEvenNumbers(int number) {
        assertTrue(checker.isEven(number), number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -1, -3, 7})
    void testIsEven_WithOddNumbers(int number) {
        assertFalse(checker.isEven(number), number + " should be odd");
    }
}
