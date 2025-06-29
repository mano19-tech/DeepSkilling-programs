import com.example.ExceptionThrower;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    @Test
    void testThrowException_WhenInputIsNull() {
        ExceptionThrower thrower = new ExceptionThrower();

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> thrower.throwException(null)
        );

        assertEquals("Input cannot be null", exception.getMessage());
    }

    @Test
    void testThrowException_WhenInputIsNotNull() {
        ExceptionThrower thrower = new ExceptionThrower();

        // No exception should be thrown
        assertDoesNotThrow(() -> thrower.throwException("Hello"));
    }
}
