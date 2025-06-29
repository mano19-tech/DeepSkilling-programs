import static org.mockito.Mockito.*;

import com.example.ApiService;
import com.example.RestClient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApiServiceTest {

    @Test
    public void testServiceWithMockRestClient() {
        // Step 1: Create mock
        RestClient mockRestClient = mock(RestClient.class);

        // Step 2: Stub the method
        when(mockRestClient.getResponse()).thenReturn("Mock Response");

        // Step 3: Inject mock into service
        ApiService apiService = new ApiService(mockRestClient);

        // Step 4: Call the method and assert result
        String result = apiService.fetchData();
        assertEquals("Fetched Mock Response", result);
    }
}
