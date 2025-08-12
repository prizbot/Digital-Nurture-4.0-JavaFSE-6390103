package com.example.mockito;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class Exercise4_HandlingVoidMethodsTest {
    @Test
    void testVoidMethod() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doNothing().when(mockApi).sendData(anyString());

        MyService service = new MyService(mockApi);
        service.pushData("Test Data");

        verify(mockApi).sendData("Test Data");
    }
}
