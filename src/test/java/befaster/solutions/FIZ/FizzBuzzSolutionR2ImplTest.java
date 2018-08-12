package befaster.solutions.FIZ;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSolutionR2ImplTest {
    private static FizzBuzzSolution fizzBuzz;

    @BeforeAll
    public static void setUp() {
        fizzBuzz = new FizzBuzzSolutionR2Impl();
    }

    @ParameterizedTest(name = "Running fizzbuzz for {0} should return {1}")
    @MethodSource("fizzBuzzData")
    public void testFizzBuzz(Integer input, String output) {
        assertEquals(output, fizzBuzz.fizzBuzz(input));
    }

    private static Stream<Arguments> fizzBuzzData() {
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
