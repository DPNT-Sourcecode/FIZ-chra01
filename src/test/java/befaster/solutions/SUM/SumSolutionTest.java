package befaster.solutions.SUM;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumSolutionTest {
    private SumSolution sum;

    @BeforeAll
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
       assertEquals(2, sum.compute(1, 1));
    }
}