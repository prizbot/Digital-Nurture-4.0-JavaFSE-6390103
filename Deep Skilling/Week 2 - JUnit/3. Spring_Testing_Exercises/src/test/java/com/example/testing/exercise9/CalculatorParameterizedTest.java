package com.example.testing.exercise9;

import com.example.testing.exercise1.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorParameterizedTest {

    private final CalculatorService service = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "5, 5, 10",
            "-2, 2, 0"
    })
    void testAddParameterized(int a, int b, int expected) {
        assertEquals(expected, service.add(a, b));
    }
}
