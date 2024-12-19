package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FloatMaxTest {

    @Test
    void floatMax() {
        List<Float> list1 = Arrays.asList(4.3f, 34.5f, 343.43f);
        assertEquals(343.43f, FloatMax.floatMax(list1), "Test Case 1 Failed: Max should be 343.43");

        // Test case 2: Maximum is at the 1st position
        List<Float> list2 = Arrays.asList(400.3f, 34.5f, 343.43f);
        assertEquals(400.3f, FloatMax.floatMax(list2), "Test Case 2 Failed: Max should be 400.3");

        // Test case 3: All numbers are the same
        List<Float> list3 = Arrays.asList(200.5f, 200.5f, 200.5f);
        assertEquals(200.5f, FloatMax.floatMax(list3), "Test Case 3 Failed: Max should be 200.5");

        // Test case 4: List contains negative numbers
        List<Float> list4 = Arrays.asList(-10.5f, -20.5f, -5.5f);
        assertEquals(-5.5f, FloatMax.floatMax(list4), "Test Case 4 Failed: Max should be -5.5");
    }
}