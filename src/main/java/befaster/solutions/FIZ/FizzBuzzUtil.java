package befaster.solutions.FIZ;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FizzBuzzUtil {

    public List<String> fizzBuzzR1(Integer number) {
        List<String> outputList = new ArrayList<>();
        if (isNumberDivisible(number, 3)) {
            outputList.add("fizz");
        } else if (isNumberDivisible(number, 5)) {
            outputList.add("buzz");
        }
        return outputList;
    }

    public List<String> fizzBuzzR2(Integer number) {
        List<String> baseList = fizzBuzzR1(number);

        List<String> outputList = new ArrayList<>();
        String numberString = String.valueOf(number);
        if (!baseList.contains("fizz") && numberString.contains("3")) {
            outputList.add("fizz");
        }
        if (!baseList.contains("buzz") && numberString.contains("5")) {
            outputList.add("buzz");
        }
        outputList.addAll(baseList);
        return outputList;
    }



    private boolean isNumberDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}
