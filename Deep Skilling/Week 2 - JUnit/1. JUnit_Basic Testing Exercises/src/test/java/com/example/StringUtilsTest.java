package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    private StringUtils utils;

    @Before
    public void setUp() {
        utils = new StringUtils();
        System.out.println("Setup before each test");
    }

    @After
    public void tearDown() {
        utils = null;
        System.out.println("Teardown after each test");
    }

    @Test
    public void testIsEmpty_withNull() {
        boolean result = utils.isEmpty(null);
        assertTrue(result);
    }

    @Test
    public void testIsEmpty_withEmptyString() {
        assertTrue(utils.isEmpty(""));
    }

    @Test
    public void testIsEmpty_withNonEmptyString() {
        assertFalse(utils.isEmpty("JUnit"));
    }
}
