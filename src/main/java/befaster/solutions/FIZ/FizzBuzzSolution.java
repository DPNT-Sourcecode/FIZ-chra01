package befaster.solutions.FIZ;

public interface FizzBuzzSolution {

    default boolean isNumberDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

    String fizzBuzz(Integer number);
}
