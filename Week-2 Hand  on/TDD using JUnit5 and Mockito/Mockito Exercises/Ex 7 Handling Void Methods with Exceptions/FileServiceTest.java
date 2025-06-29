package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class FileServiceTest {

    @Test
    public void testVoidMethodThrowsException() {
        // Step 1: Create mock
        FileManager mockManager = mock(FileManager.class);

        // Step 2: Stub the void method to throw an exception
        doThrow(new RuntimeException("Disk error"))
                .when(mockManager).deleteFile("important.txt");

        // Step 3: Inject mock and call method
        FileService service = new FileService(mockManager);
        boolean result = service.safelyDelete("important.txt");

        // Step 4: Assert the result and verify interaction
        assertFalse(result);  // Because exception is thrown and caught
        verify(mockManager).deleteFile("important.txt");
    }
}
