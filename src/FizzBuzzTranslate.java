public class FizzBuzzTranslate {
    static String translate(int number) {

        Boolean isDivisibleBy3 = number % 3 == 0;
        Boolean isDivisibleBy5 = number % 5 == 0;

        if (isDivisibleBy3 && isDivisibleBy5) {
            return "FizzBuzz";
        } else if (isDivisibleBy3 || includeFizzOrBuzz(number,3)) {
            return "Fizz";
        } else if (isDivisibleBy5 || includeFizzOrBuzz(number,5)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private static Boolean includeFizzOrBuzz(int number, int fizzOrBuzz) {
        while (number > 0) {
            int remainder = number % 10;
            if (remainder == fizzOrBuzz) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
