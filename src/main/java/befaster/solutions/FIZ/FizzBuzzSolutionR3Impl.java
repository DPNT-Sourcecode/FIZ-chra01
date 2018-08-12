package befaster.solutions.FIZ;

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
            baseOutput = baseOutput.equals(String.valueOf(number)) ? "deluxe" : baseOutput + " deluxe";
        }

        return baseOutput;
    }

}
