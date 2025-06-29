import static org.mockito.Mockito.*;

import com.example.NetworkClient;
import com.example.NetworkService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NetworkServiceTest {

    @Test
    public void testServiceWithMockNetworkClient() {
        // Step 1: Create mock
        NetworkClient mockNetworkClient = mock(NetworkClient.class);

        // Step 2: Stub the method
        when(mockNetworkClient.connect()).thenReturn("Mock Connection");

        // Step 3: Inject mock into service
        NetworkService networkService = new NetworkService(mockNetworkClient);

        // Step 4: Call method and assert result
        String result = networkService.connectToServer();
        assertEquals("Connected to Mock Connection", result);
    }
}
