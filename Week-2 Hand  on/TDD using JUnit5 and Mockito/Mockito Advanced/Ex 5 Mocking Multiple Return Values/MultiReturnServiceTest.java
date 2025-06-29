import static org.mockito.Mockito.*;

import com.example.Repository;
import com.example.Service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiReturnServiceTest {

    @Test
    public void testServiceWithMultipleReturnValues() {
        // Step 1: Create mock
        Repository mockRepository = mock(Repository.class);

        // Step 2: Stub multiple return values
        when(mockRepository.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");

        // Step 3: Inject mock into service
        Service service = new Service(mockRepository);

        // Step 4: Call processData() multiple times
        String firstResult = service.processData();   // Uses 1st return value
        String secondResult = service.processData();  // Uses 2nd return value

        // Step 5: Verify both results
        assertEquals("Processed First Mock Data", firstResult);
        assertEquals("Processed Second Mock Data", secondResult);
    }
}
