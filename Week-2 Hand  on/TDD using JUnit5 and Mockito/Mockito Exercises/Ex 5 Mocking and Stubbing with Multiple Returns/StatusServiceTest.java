package com.example;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class StatusServiceTest {

    @Test
    public void testMultipleReturnsFromMock() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub method to return different values on each call
        when(mockApi.getStatus()).thenReturn("PENDING", "COMPLETED");

        // Step 3: Inject into service and call
        StatusService service = new StatusService(mockApi);
        String[] result = service.checkStatusTwice();

        // Step 4: Assert the sequence of results
        assertEquals("PENDING", result[0]);
        assertEquals("COMPLETED", result[1]);

        // Optional: Verify that method was called twice
        verify(mockApi, times(2)).getStatus();
    }
}
