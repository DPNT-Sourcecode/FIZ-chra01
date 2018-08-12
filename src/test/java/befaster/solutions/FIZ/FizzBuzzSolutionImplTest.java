package befaster.solutions.FIZ;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSolutionImplTest {

    private static FizzBuzzSolution fizzBuzz;

//    @BeforeAll
//    public static void setUp() {
//        fizzBuzz = new FizzBuzzSolutionImpl(FizzBuzzUtil::fizzBuzzR1);
//    }

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
    public void testFizzBuzz(Integer input, String output) {
        fizzBuzz = new FizzBuzzSolutionImpl(FizzBuzzUtil::fizzBuzzR2);
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

}
