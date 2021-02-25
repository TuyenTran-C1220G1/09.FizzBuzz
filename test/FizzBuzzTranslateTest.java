import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void testTranslateOf3() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void testTranslateOf5() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void testTranslateOf15() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void testTranslateOf4() {
        int number = 4;
        String expected = "4";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void testTranslateOf13() {
        int number = 13;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void testTranslateOf25() {
        int number = 25;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
}