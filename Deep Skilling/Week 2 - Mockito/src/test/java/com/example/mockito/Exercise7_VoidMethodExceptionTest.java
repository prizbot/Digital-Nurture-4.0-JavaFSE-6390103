package com.example.mockito;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class Exercise7_VoidMethodExceptionTest {
    @Test
    void testVoidMethodThrowsException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("Error")).when(mockApi).process();

        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, service::processData);
        verify(mockApi).process();
    }
}
