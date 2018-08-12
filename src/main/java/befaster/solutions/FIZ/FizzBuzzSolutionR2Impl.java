package befaster.solutions.FIZ;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzSolutionR2Impl implements FizzBuzzSolution {
    private FizzBuzzSolution baseSolution;

    public FizzBuzzSolutionR2Impl(FizzBuzzSolution baseSolution) {
        this.baseSolution = baseSolution;
    }

    @Override
    public String fizzBuzz(Integer number) {
        List<String> outputList = new ArrayList<>();
        String numberString = String.valueOf(number);
        if (isNumberDivisible(number, 3) || numberString.contains("3")) {
            outputList.add("fizz");
        }
        if (isNumberDivisible(number, 5) || numberString.contains("5")) {
            outputList.add("buzz");
        }
        if (outputList.isEmpty()) outputList.add(numberString);
        return String.join(" ", outputList);
    }
}
