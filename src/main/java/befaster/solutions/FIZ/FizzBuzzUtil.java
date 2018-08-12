package befaster.solutions.FIZ;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzUtil {

    public static List<String> fizzBuzzR1(Integer number) {
        List<String> outputList = new ArrayList<>();
        if (isNumberDivisible(number, 3)) {
            outputList.add("fizz");
        }

        if (isNumberDivisible(number, 5)) {
            outputList.add("buzz");
        }
        return outputList;
    }

    public static List<String> fizzBuzzR2(Integer number) {
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

    public static List<String> fizzBuzzR3(Integer number) {
        List<String> baseList = fizzBuzzR2(number);
        String numberString = String.valueOf(number);

        if (number > 10 && numberString.chars().filter(c -> c == numberString.charAt(0)).count() == numberString.length()) {
            baseList.add("deluxe");
        }
        return baseList;
    }

    public static List<String> fizzBuzzR4(Integer number) {
        List<String> baseList = fizzBuzzR3(number);

        if (number%2 == 1 && baseList.contains("deluxe")) {
            baseList.remove("deluxe");
            baseList.add("fake deluxe");
        }

        return baseList;
    }

    private static boolean isNumberDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}
