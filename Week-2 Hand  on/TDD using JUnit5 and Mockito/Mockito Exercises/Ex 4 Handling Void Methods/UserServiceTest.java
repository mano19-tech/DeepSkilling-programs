package com.example;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    public void testVoidMethodInteraction() {
        // Step 1: Create mock
        UserRepository mockRepo = mock(UserRepository.class);

        // Step 2: Stub the void method (optional, used if it throws)
        doNothing().when(mockRepo).deleteUserById(anyInt());

        // Step 3: Inject mock into service
        UserService service = new UserService(mockRepo);
        service.removeUser(42);

        // Step 4: Verify that the void method was called with correct argument
        verify(mockRepo).deleteUserById(42);
    }
}
