import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import com.example.ExternalApi;
import com.example.MyService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create a mock for ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Stub getData() to return a fixed value
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject the mock into MyService
        MyService service = new MyService(mockApi);

        // Step 4: Call the method and assert the result
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
