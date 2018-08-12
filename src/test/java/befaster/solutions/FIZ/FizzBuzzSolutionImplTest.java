package befaster.solutions.FIZ;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSolutionImplTest {

    private static FizzBuzzSolution fizzBuzz;

    @DisplayName("FizzBuzz R1")
    @ParameterizedTest(name = "Running fizzbuzz for {0} should return {1}")
    @MethodSource("fizzBuzzDataR1")
    public void testFizzBuzzR1(Integer input, String output) {
        fizzBuzz = new FizzBuzzSolutionImpl(FizzBuzzUtil::fizzBuzzR1);
        assertEquals(output, fizzBuzz.fizzBuzz(input));
    }

    @DisplayName("FizzBuzz R2")
    @ParameterizedTest(name = "Running fizzbuzz R2 for {0} should return {1}")
    @MethodSource("fizzBuzzDataR2")
    public void testFizzBuzzR2(Integer input, String output) {
        fizzBuzz = new FizzBuzzSolutionImpl(FizzBuzzUtil::fizzBuzzR2);
        assertEquals(output, fizzBuzz.fizzBuzz(input));
    }

    @DisplayName("FizzBuzz R3")
    @ParameterizedTest(name = "Running fizzbuzz for {0} should return {1}")
    @MethodSource("fizzBuzzDataR3")
    public void testFizzBuzzR3(Integer input, String output) {
        fizzBuzz = new FizzBuzzSolutionImpl(FizzBuzzUtil::fizzBuzzR3);
        assertEquals(output, fizzBuzz.fizzBuzz(input));
    }

    @DisplayName("FizzBuzz R4")
    @ParameterizedTest(name = "Running fizzbuzz for {0} should return {1}")
    @MethodSource("fizzBuzzDataR4")
    public void testFizzBuzzR4(Integer input, String output) {
        fizzBuzz = new FizzBuzzSolutionImpl(FizzBuzzUtil::fizzBuzzR4);
        assertEquals(output, fizzBuzz.fizzBuzz(input));
    }

    @DisplayName("FizzBuzz R5")
    @ParameterizedTest(name = "Running fizzbuzz for {0} should return {1}")
    @MethodSource("fizzBuzzDataR5")
    public void testFizzBuzzR5(Integer input, String output) {
        fizzBuzz = new FizzBuzzSolutionImpl(FizzBuzzUtil::fizzBuzzR5);
        assertEquals(output, fizzBuzz.fizzBuzz(input));
    }

    private static Stream<Arguments> fizzBuzzDataR1() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(3, "fizz"),
                Arguments.of(9, "fizz"),
                Arguments.of(5, "buzz"),
                Arguments.of(10, "buzz"),
                Arguments.of(15, "fizz buzz"),
                Arguments.of(30, "fizz buzz")
        );
    }

    private static Stream<Arguments> fizzBuzzDataR2() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(3, "fizz"),
                Arguments.of(13, "fizz"),
                Arguments.of(9, "fizz"),
                Arguments.of(5, "buzz"),
                Arguments.of(15, "fizz buzz"),
                Arguments.of(10, "buzz"),
                Arguments.of(35, "fizz buzz"),
                Arguments.of(53, "fizz buzz")
        );
    }

    private static Stream<Arguments> fizzBuzzDataR3() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(3, "fizz"),
                Arguments.of(13, "fizz"),
                Arguments.of(9, "fizz"),
                Arguments.of(5, "buzz"),
                Arguments.of(15, "fizz buzz"),
                Arguments.of(10, "buzz"),
                Arguments.of(35, "fizz buzz"),
                Arguments.of(53, "fizz buzz"),
                Arguments.of(33, "fizz deluxe"),
                Arguments.of(11, "deluxe")
        );
    }

    private static Stream<Arguments> fizzBuzzDataR4() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(3, "fizz"),
                Arguments.of(13, "fizz"),
                Arguments.of(9, "fizz"),
                Arguments.of(5, "buzz"),
                Arguments.of(15, "fizz buzz"),
                Arguments.of(10, "buzz"),
                Arguments.of(35, "fizz buzz"),
                Arguments.of(53, "fizz buzz"),
                Arguments.of(33, "fizz fake deluxe"),
                Arguments.of(11, "fake deluxe"),
                Arguments.of(22, "deluxe"),
                Arguments.of(546, "fizz buzz")
        );
    }

    private static Stream<Arguments> fizzBuzzDataR5() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(3, "fizz deluxe"),
                Arguments.of(6, "fizz"),
                Arguments.of(13, "fizz"),
                Arguments.of(9, "fizz"),
                Arguments.of(5, "buzz"),
                Arguments.of(15, "fizz buzz deluxe"),
                Arguments.of(10, "buzz"),
                Arguments.of(35, "fizz buzz deluxe"),
                Arguments.of(53, "fizz buzz"),
                Arguments.of(33, "fizz fake deluxe"),
                Arguments.of(11, "fake deluxe"),
                Arguments.of(22, "deluxe"),
                Arguments.of(546, "fizz buzz deluxe")
        );
    }

}
