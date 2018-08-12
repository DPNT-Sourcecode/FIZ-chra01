package befaster.solutions.FIZ;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzSolutionR2Impl implements FizzBuzzSolution {

    @Override
    public String fizzBuzz(Integer number) {
        List<String> output = new ArrayList<>();
        if (isNumberDivisible(number, 3) || String.valueOf(number).contains("3")) {
            output.add("fizz");
        } else if (isNumberDivisible(number, 5) || String.valueOf(number).contains("5")) {
            output.add("buzz");
        }

        if (output.size() == 0) {
            output.add(String.valueOf(number));
        }
        return String.join(" ", output);
    }
}
