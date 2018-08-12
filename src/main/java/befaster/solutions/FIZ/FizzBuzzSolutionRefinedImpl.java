package befaster.solutions.FIZ;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FizzBuzzSolutionRefinedImpl {

    FizzBuzzSolution baseSolution;
    BiFunction<Integer, String, String> conversionFunction;

    public FizzBuzzSolutionRefinedImpl(FizzBuzzSolution baseSolution, Function<Integer, String> conversionFunction) {
        this.baseSolution = baseSolution;
        this.conversionFunction = conversionFunction;
    }

    @Override
    public String fizzBuzz(Integer number) {
        String output = baseSolution.fizzBuzz(number);
        return
    }
}
