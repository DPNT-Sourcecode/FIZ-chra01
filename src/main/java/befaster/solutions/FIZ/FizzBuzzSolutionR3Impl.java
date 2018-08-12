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

        if (number > 10 && numberString.chars().filter(c -> c == numberString.charAt(0)).count() == numberString.length()) {
            return numberString.equals(String.valueOf(number)) ? baseOutput
        }
    }

}
