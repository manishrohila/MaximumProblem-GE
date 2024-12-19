package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMaxTest {
    @Test
    public void testFindMaxString() {
        // Test case 1: Maximum is at the 1st position
        assertEquals("Peach", StringMax.findMaxString("Peach", "Apple", "Banana"),
                "Test Case 1 Failed: Max should be Peach");

        // Test case 2: Maximum is at the 2nd position
        assertEquals("Peach", StringMax.findMaxString("Apple", "Peach", "Banana"),
                "Test Case 2 Failed: Max should be Peach");

        // Test case 3: Maximum is at the 3rd position
        assertEquals("Peach", StringMax.findMaxString("Apple", "Banana", "Peach"),
                "Test Case 3 Failed: Max should be Peach");
    }
}