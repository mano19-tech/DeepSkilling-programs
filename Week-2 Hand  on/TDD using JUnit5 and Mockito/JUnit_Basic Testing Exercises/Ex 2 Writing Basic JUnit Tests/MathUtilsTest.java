import com.example.MathUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        MathUtils math = new MathUtils();
        assertEquals(5, math.add(2, 3));
    }

    @Test
    public void testSubtract() {
        MathUtils math = new MathUtils();
        assertEquals(1, math.subtract(5, 4));
    }

    @Test
    public void testMultiply() {
        MathUtils math = new MathUtils();
        assertEquals(20, math.multiply(4, 5));
    }

    @Test
    public void testDivide() {
        MathUtils math = new MathUtils();
        assertEquals(2, math.divide(10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        MathUtils math = new MathUtils();
        math.divide(10, 0);  // Should throw exception
    }
}
