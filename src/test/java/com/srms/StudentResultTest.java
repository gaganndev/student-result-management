
package com.srms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentResultTest {

    private final StudentResult result = new StudentResult();

    @Test
    void testCalculateTotal() {
        assertEquals(240, result.calculateTotal(80, 75, 85));
    }

    @Test
    void testCalculatePercentage() {
        assertEquals(80.0, result.calculatePercentage(80, 75, 85), 0.01);
    }

    @Test
    void testCalculateGrade() {
        assertEquals("A", result.calculateGrade(80, 75, 85));
    }

    @Test
    void testInvalidMarks() {
        assertThrows(IllegalArgumentException.class,
                () -> result.calculateTotal(80, 110, 85));
    }
}
