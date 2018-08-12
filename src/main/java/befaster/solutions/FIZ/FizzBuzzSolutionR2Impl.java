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
        String output = this.baseSolution.fizzBuzz(number);
        List<String> outputList = new ArrayList<>();
        if (output.contains("3")) {
            outputList.add("fizz");
        }
        if (output.contains("5")) {
            outputList.add("buzz");
        }

        return outputList.size() == 0 ? output : String.join(" ", outputList);
    }
}
