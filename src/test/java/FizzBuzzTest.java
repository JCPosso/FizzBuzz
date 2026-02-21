import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void testFizzBuzzNumero() {
        assertEquals("2", FizzBuzz.fizzbuzz(2));
    }

    @Test
    void testFizzBuzzMultiplo3() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
    }

    @Test
    void testFizzBuzzMultiplo5() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
    }

    @Test
    void testFizzBuzzMultiplo3y5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }
}
