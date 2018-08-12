package befaster.solutions.FIZ;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FizzBuzzUtil {



    public String fizzBuzzR1(Integer number) {
        List<String> outputList = new ArrayList<>();
        String output = String.valueOf(number);
        if (isNumberDivisible(number, 15)) {
            output = "fizz buzz";
        } else if (isNumberDivisible(number, 3)) {
            output = "fizz";
        } else if (isNumberDivisible(number, 5)) {
            output = "buzz";
        }
    }

    private boolean isNumberDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}
