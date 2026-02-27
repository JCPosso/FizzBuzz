import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase FizzBuzz.
 */
@DisplayName("Pruebas del juego FizzBuzz")
class FizzBuzzTest {
    
    @Test
    @DisplayName("Dado un número no múltiplo de 3 ni 5, cuando se ejecuta fizzbuzz, entonces retorna el número como String")
    void whenInputIsNotMultipleOfThreeOrFive_thenReturnNumberAsString() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
        assertEquals("2", FizzBuzz.fizzbuzz(2));
        assertEquals("4", FizzBuzz.fizzbuzz(4));
        assertEquals("7", FizzBuzz.fizzbuzz(7));
        assertEquals("8", FizzBuzz.fizzbuzz(8));
    }
        
    @Test
    @DisplayName("Dado un número múltiplo de 3 (pero no de 5), cuando se ejecuta fizzbuzz, entonces retorna 'Fizz'")
    void whenInputIsMultipleOfThreeOnly_thenReturnFizz() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(6));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(9));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(12));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(18));
    }
    
    @Test
    @DisplayName("Dado un número múltiplo de 5 (pero no de 3), cuando se ejecuta fizzbuzz, entonces retorna 'Buzz'")
    void whenInputIsMultipleOfFiveOnly_thenReturnBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(20));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(25));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(35));
    }
    
    @Test
    @DisplayName("Dado un número múltiplo de 3 y 5 (múltiplo de 15), cuando se ejecuta fizzbuzz, entonces retorna 'FizzBuzz'")
    void whenInputIsMultipleOfThreeAndFive_thenReturnFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(30));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(45));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(60));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(75));
    }
}
