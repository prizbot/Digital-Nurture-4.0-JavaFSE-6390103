package com.example.mockito;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class Exercise2_VerifyingInteractionsTest {
    @Test
    void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }
}
