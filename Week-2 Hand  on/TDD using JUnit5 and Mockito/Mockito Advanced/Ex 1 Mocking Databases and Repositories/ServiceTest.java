import static org.mockito.Mockito.*;

import com.example.Repository;
import com.example.Service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    @Test
    public void testServiceWithMockRepository() {
        // Step 1: Create mock
        Repository mockRepository = mock(Repository.class);

        // Step 2: Stub method
        when(mockRepository.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into service
        Service service = new Service(mockRepository);

        // Step 4: Call method and verify result
        String result = service.processData();
        assertEquals("Processed Mock Data", result);
    }
}
