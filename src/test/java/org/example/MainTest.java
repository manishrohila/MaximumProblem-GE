package org.example;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void maxOfThreeTest (){


        // Test case 1: Maximum is at the 3rd position
        List<Integer> list1 = Arrays.asList(100, 300, 455);
        assertEquals(455, Main.findMax(list1), "Test Case 1 Failed: Max should be 455");

        // Test case 2: Maximum is at the 2nd position
        List<Integer> list2 = Arrays.asList(100, 500, 455);
        assertEquals(500, Main.findMax(list2), "Test Case 2 Failed: Max should be 500");

        // Test case 3: All numbers are the same
        List<Integer> list3 = Arrays.asList(200, 200, 200);
        assertEquals(200, Main.findMax(list3), "Test Case 3 Failed: Max should be 200");

        // Test case 4: List contains negative numbers
        List<Integer> list4 = Arrays.asList(-10, -20, -5);
        assertEquals(-5, Main.findMax(list4), "Test Case 4 Failed: Max should be -5");

    }
}