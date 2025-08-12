package com.example.testing.exercise2;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Test
    void testGetUserById() {
        UserRepository mockRepo = Mockito.mock(UserRepository.class);
        UserService service = new UserService();
        service = Mockito.spy(service);
        Mockito.doReturn(mockRepo).when(service).getUserRepository();

        User user = new User();
        user.setId(1L);
        user.setName("John");

        when(mockRepo.findById(1L)).thenReturn(Optional.of(user));

        assertEquals("John", service.getUserById(1L).getName());
    }
}
