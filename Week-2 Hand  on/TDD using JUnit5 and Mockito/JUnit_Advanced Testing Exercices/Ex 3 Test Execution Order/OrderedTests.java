
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Specify ordering strategy
public class OrderedTests {

    @Test
    @Order(1)
    void testFirst() {
        System.out.println("Running testFirst");
        assertTrue(true);
    }

    @Test
    @Order(3)
    void testThird() {
        System.out.println("Running testThird");
        assertTrue(true);
    }

    @Test
    @Order(2)
    void testSecond() {
        System.out.println("Running testSecond");
        assertTrue(true);
    }
}
