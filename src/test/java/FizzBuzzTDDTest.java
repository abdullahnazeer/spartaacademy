import FizzBuzzTDD.FizzBuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTDDTest {

    @Test
    @DisplayName("Given one, return as a String")
    public void GivenOne_ReturnAsAString() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.FizzBuzz(1));
    }

    @ParameterizedTest
    @CsvSource({"1", "3", "18", "14"})
    @DisplayName("Given a number, return as a String")
    public void GivenANumber_ReturnAsAString() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = "";
        assertEquals("", fizzBuzz.FizzBuzz(1));
    }

    @Test
    @DisplayName("Given three, return 1 2 Fizz")
    public void GivenThree_ReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1 2 Fizz", fizzBuzz.FizzBuzz(3));
    }

    @Test
    @DisplayName("Given five, return Buzz")
    public void GivenFive_ReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1 2 Fizz 4 Buzz", fizzBuzz.FizzBuzz(5));
    }

}
