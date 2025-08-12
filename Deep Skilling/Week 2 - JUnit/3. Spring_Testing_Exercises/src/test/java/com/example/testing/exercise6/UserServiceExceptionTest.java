package com.example.testing.exercise6;

import com.example.testing.exercise2.UserRepository;
import com.example.testing.exercise2.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserServiceExceptionTest {

    @Test
    void testMissingUser() {
        UserRepository mockRepo = Mockito.mock(UserRepository.class);
        when(mockRepo.findById(99L)).thenReturn(Optional.empty());

        UserService service = new UserService();
        // Inject mock repository manually
        try {
            var field = UserService.class.getDeclaredField("userRepository");
            field.setAccessible(true);
            field.set(service, mockRepo);
        } catch (Exception ignored) {}

        assertNull(service.getUserById(99L));
    }
}
