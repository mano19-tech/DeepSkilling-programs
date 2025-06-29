
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.example.ExternalApi;
import com.example.MyService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Use the mock in the service
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify that getData() was called exactly once
        verify(mockApi).getData();  // Same as verify(mockApi, times(1)).getData();

    }
}

