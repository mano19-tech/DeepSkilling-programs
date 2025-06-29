import com.example.PerformanceTester;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    void testPerformTask_CompletesWithinTimeout() {
        PerformanceTester tester = new PerformanceTester();

        assertTimeout(Duration.ofMillis(500), tester::performTask,
                "Method should complete within 500 milliseconds");
    }

    @Test
    void testPerformTask_FailsIfTooSlow() {
        PerformanceTester slowTester = new PerformanceTester() {
            @Override
            public void performTask() {
                try {
                    Thread.sleep(1000); // Simulate a slow task
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        assertTimeoutPreemptively(Duration.ofMillis(700), slowTester::performTask,
                "Should fail if method takes longer than 700 ms");
    }

}


