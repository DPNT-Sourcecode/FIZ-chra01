package befaster.solutions.FIZ;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSolutionTest {

    private static FizzBuzzSolution fizzBuzz;

    @BeforeAll
    public static void setUp() {
        fizzBuzz = new FizzBuzzSolution();
    }

    @ParameterizedTest(name = "Running fizzbuzz for {0} should return {1}")
    @MethodSource("fizzBuzzData")
    public void testFizzBuzz(Integer input, String output) {
        assertEquals(output, fizzBuzz.fizzBuzz(input));
    }

    private static Stream<Arguments> createFizzBuzz() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(3, "fizz"),
                Arguments.of(5, "buzz"),
                Arguments.of(15, "fizz buzz")
        );
    }

}
