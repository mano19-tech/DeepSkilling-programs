import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals("2 + 3 should equal 5", 5, 2 + 3);

        // Assert true
        assertTrue("5 is greater than 3", 5 > 3);

        // Assert false
        assertFalse("5 is not less than 3", 5 < 3);

        // Assert null
        Object obj = null;
        assertNull("Object should be null", obj);

        // Assert not null
        Object newObj = new Object();
        assertNotNull("Object should not be null", newObj);
    }
}
