/**
 * Implementación juego FizzBuzz.
 */
public class FizzBuzz {
    
    public static String fizzbuzz(int number) {
        if (isFizzBuzz(number)) {
            return "FizzBuzz";
        }
        if (isFizz(number)) {
            return "Fizz";
        }
        if (isBuzz(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private static boolean isFizzBuzz(int number) {
        return number % 15 == 0;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }
}
