package befaster.solutions.SUM;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumSolutionTest {
    private static SumSolution sum;

    @BeforeAll
    public static void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
       assertEquals(2, sum.compute(1, 1));
    }
}
