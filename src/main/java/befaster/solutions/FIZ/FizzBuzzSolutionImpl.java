package befaster.solutions.FIZ;

import java.util.List;
import java.util.function.Function;

public class FizzBuzzSolutionImpl implements FizzBuzzSolution {

    Function<Integer, List<String>> transformer;

    public FizzBuzzSolutionImpl(Function<Integer, List<String>> transformer) {
        this.transformer = transformer;
    }

    @Override
    public String fizzBuzz(Integer number) {
        List<String> transformedInput = transformer.apply(number);
        return transformedInput.isEmpty() ? String.valueOf(number) : String.join(" ", transformedInput);
//        String output = String.valueOf(number);
//        if (isNumberDivisible(number, 15)) {
//            output = "fizz buzz";
//        } else if (isNumberDivisible(number, 3)) {
//            output = "fizz";
//        } else if (isNumberDivisible(number, 5)) {
//            output = "buzz";
//        }
//        return output;
    }

}
