package befaster.solutions.FIZ;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class FizzBuzzSolutionR3Impl implements FizzBuzzSolution {

    FizzBuzzSolution baseSolution;

    public FizzBuzzSolutionR3Impl(FizzBuzzSolution baseSolution) {
        this.baseSolution = baseSolution;
    }

    @Override
    public String fizzBuzz(Integer number) {
        String numberString = String.valueOf(number);
        String baseOutput = baseSolution.fizzBuzz(number);

        if (number > 10) {
            numberString.chars().mapToObj(c -> (char) c).collect(groupingBy(c -> c));
        }

        List<String> outputList = new ArrayList<>();

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
