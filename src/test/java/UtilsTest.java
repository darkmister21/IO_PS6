import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    // =========================
    // Zadanie 1
    // =========================

    @Test
    void testAddPositiveNumbers() {
        assertEquals(10, Utils.addNumbers(4, 6));
    }

    @Test
    void testAddPositiveAndNegative() {
        assertEquals(2, Utils.addNumbers(5, -3));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-8, Utils.addNumbers(-5, -3));
    }

    @Test
    void testAddWithZero() {
        assertEquals(7, Utils.addNumbers(7, 0));
    }


    // =========================
    // Zadanie 2
    // =========================

    @Test
    void testEvenNumbers() {
        assertTrue(Utils.isEven(4));
        assertTrue(Utils.isEven(10));
        assertTrue(Utils.isEven(0));
    }

    @Test
    void testOddNumbers() {
        assertFalse(Utils.isEven(3));
        assertFalse(Utils.isEven(7));
        assertFalse(Utils.isEven(-1));
    }

    @Test
    void testLargeEvenNumber() {
        assertTrue(Utils.isEven(1000000));
    }


    // =========================
    // Zadanie 3
    // =========================

    @Test
    void testStandardTemperatures() {
        assertEquals(32, Utils.celsiusToFahrenheit(0));
        assertEquals(212, Utils.celsiusToFahrenheit(100));
    }

    @Test
    void testNegativeTemperature() {
        assertEquals(14, Utils.celsiusToFahrenheit(-10));
    }

    @Test
    void testLargeTemperature() {
        assertEquals(1832, Utils.celsiusToFahrenheit(1000));
    }


    // =========================
    // Zadanie 4
    // =========================

    @Test
    void testSmallFactorials() {
        assertEquals(1, Utils.factorial(0));
        assertEquals(1, Utils.factorial(1));
        assertEquals(2, Utils.factorial(2));
    }

    @Test
    void testLargeFactorials() {
        assertEquals(120, Utils.factorial(5));
        assertEquals(3628800, Utils.factorial(10));
    }

    @Test
    void testNegativeFactorial() {
        assertThrows(IllegalArgumentException.class,
                () -> Utils.factorial(-5));
    }


    // =========================
    // Zadanie 5
    // =========================

    @Test
    void testPrimeNumbers() {
        assertTrue(Utils.isPrime(2));
        assertTrue(Utils.isPrime(3));
        assertTrue(Utils.isPrime(5));
        assertTrue(Utils.isPrime(7));
    }

    @Test
    void testNonPrimeNumbers() {
        assertFalse(Utils.isPrime(4));
        assertFalse(Utils.isPrime(6));
        assertFalse(Utils.isPrime(8));
        assertFalse(Utils.isPrime(9));
    }

    @Test
    void testNumbersLessThanTwo() {
        assertFalse(Utils.isPrime(0));
        assertFalse(Utils.isPrime(1));
        assertFalse(Utils.isPrime(-5));
    }

    @Test
    void testLargePrimeNumber() {
        assertTrue(Utils.isPrime(101));
    }
}