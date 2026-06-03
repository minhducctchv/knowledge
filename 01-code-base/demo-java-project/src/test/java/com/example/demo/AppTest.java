package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit tests for the App class.
 */
class AppTest {

    @Test
    void greetingIsNotNull() {
        App app = new App();
        assertNotNull(app.getGreeting(), "greeting should not be null");
    }
}
