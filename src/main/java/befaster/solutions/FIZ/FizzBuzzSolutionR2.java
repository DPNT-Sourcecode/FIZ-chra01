package befaster.solutions.FIZ;

public class FizzBuzzSolutionR2 implements FizzBuzzSolution {

    @Override
    public String fizzBuzz(Integer number) {
        StringBuilder output = new StringBuilder();
        if (isNumberDivisible(number, 3) || String.valueOf(number).contains("3")) {
            output.append("fizz");
        } else if (isNumberDivisible(number, 5) || String.valueOf(number).contains("5")) {
            output.append("buzz");
        }

        if (output.length() == 0) {
            output.append(number);
        }
        return output.toString();
    }
}
