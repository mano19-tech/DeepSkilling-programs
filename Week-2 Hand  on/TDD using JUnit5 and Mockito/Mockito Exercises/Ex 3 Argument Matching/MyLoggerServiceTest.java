package com.example;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

import org.junit.jupiter.api.Test;

public class MyLoggerServiceTest {

    @Test
    public void testArgumentMatching() {
        // Step 1: Create mock
        Logger mockLogger = mock(Logger.class);

        // Step 2: Inject mock into service
        MyLoggerService service = new MyLoggerService(mockLogger);
        service.doSomething();

        // Step 3: Verify with argument matchers
        verify(mockLogger).log(eq("INFO"), eq("Task completed successfully"));
    }
}
