//public class CalculatorTest {
//}

import org.junit.After;
import com.example.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    // Setup method - runs before each test
    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calculator = new Calculator(); // Arrange
    }

    // Teardown method - runs after each test
    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calculator = null;
    }

    @Test
    public void testAdd() {
        // Act
        int result = calculator.add(10, 5);

        // Assert
        assertEquals("10 + 5 should be 15", 15, result);
    }

    @Test
    public void testMultiply() {
        // Act
        int result = calculator.multiply(3, 4);

        // Assert
        assertEquals("3 * 4 should be 12", 12, result);
    }
}
