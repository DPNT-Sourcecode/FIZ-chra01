package befaster.solutions.FIZ;

import java.util.ArrayList;
import java.util.List;

public interface FizzBuzzSolution {

    default boolean isNumberDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

    String fizzBuzz(Integer number);
}
