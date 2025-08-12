package com.example.mockito;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class Exercise6_VerifyingInteractionOrderTest {
    @Test
    void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.pushData("Data");
        service.fetchData();

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).sendData("Data");
        inOrder.verify(mockApi).getData();
    }
}
