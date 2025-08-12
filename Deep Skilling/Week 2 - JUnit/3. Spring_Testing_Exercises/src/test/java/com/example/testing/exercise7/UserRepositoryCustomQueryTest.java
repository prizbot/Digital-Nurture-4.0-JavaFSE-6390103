package com.example.testing.exercise7;

import com.example.testing.exercise2.User;
import com.example.testing.exercise2.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryCustomQueryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testFindByName() {
        User user = new User();
        user.setId(200L);
        user.setName("David");
        userRepository.save(user);

        List<User> result = userRepository.findByName("David");

        assertFalse(result.isEmpty());
        assertEquals("David", result.get(0).getName());
    }
}
