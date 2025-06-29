package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class ProcessorTest {

    @Test
    public void testMethodCallOrder() {
        // Step 1: Create mock
        Workflow mockWorkflow = mock(Workflow.class);

        // Step 2: Inject into service and call methods in order
        Processor processor = new Processor(mockWorkflow);
        processor.runProcess();

        // Step 3: Create InOrder verifier and verify call sequence
        InOrder inOrder = inOrder(mockWorkflow);

        inOrder.verify(mockWorkflow).start();
        inOrder.verify(mockWorkflow).process();
        inOrder.verify(mockWorkflow).finish();
    }
}
