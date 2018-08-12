package befaster.solutions.FIZ;

public class FizzBuzzSolutionImpl implements FizzBuzzSolution {

    @Override
    public String fizzBuzz(Integer number) {
        String output = String.valueOf(number);
        if (isNumberDivisible(number, 15)) {
            output = "fizz buzz";
        } else if (isNumberDivisible(number, 3)) {
            output = "fizz";
        } else if (isNumberDivisible(number, 5)) {
            output = "buzz";
        }
        return output;
    }

}
