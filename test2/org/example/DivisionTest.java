package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void division() {
        assertEquals(5, Division.division(10, 2));
        assertEquals(3, Division.division(9, 3));
        assertEquals(-4, Division.division(-12, 3));
    }

    @Test
    void divisionUsingLoop() {
        assertEquals(5, Division.divisionUsingLoop(10, 2));
        assertEquals(3, Division.divisionUsingLoop(9, 3));
        assertEquals(-4, Division.divisionUsingLoop(-12, 3));
    }

    @Test
    void divisionUsingRecursion() {
        assertEquals(5, Division.divisionUsingRecursion(10, 2));
        assertEquals(3, Division.divisionUsingRecursion(9, 3));
        assertEquals(-4, Division.divisionUsingRecursion(-12, 3));

    }

    @Test
    void divisionUsingMultiplication() {
        assertEquals(5, Division.divisionUsingMultiplication(10, 2));
        assertEquals(3, Division.divisionUsingMultiplication(9, 3));
        assertEquals(-4, Division.divisionUsingMultiplication(-12, 3));
    }

    @Test
    void divisionUsingShift() {
        assertEquals(5, Division.divisionUsingShift(10, 2));
        assertEquals(3, Division.divisionUsingShift(9, 3));
        assertEquals(-4, Division.divisionUsingShift(-12, 3));

    }

    @Test
    void divisionUsingLogs() {
        assertEquals(5, Division.divisionUsingLogs(10, 2));
        assertEquals(3, Division.divisionUsingLogs(9, 3));
        assertEquals(-4, Division.divisionUsingLogs(-12, 3));

    }
}