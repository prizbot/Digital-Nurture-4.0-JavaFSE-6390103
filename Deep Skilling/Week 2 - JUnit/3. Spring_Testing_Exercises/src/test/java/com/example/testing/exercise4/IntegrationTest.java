package com.example.testing.exercise4;

import com.example.testing.exercise2.User;
import com.example.testing.exercise2.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

    @Test
    void testFullFlow() {
        // Save a user
        User savedUser = new User();
        savedUser.setId(100L);
        savedUser.setName("Bob");
        userRepository.save(savedUser);

        // Call REST endpoint
        ResponseEntity<User> response = restTemplate.getForEntity("/users/100", User.class);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals("Bob", response.getBody().getName());
    }
}
