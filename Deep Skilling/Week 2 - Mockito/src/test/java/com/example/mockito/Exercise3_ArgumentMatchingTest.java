package com.example.mockito;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.eq;

class Exercise3_ArgumentMatchingTest {
    @Test
    void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.pushData("Hello");

        verify(mockApi).sendData(eq("Hello"));
    }
}
