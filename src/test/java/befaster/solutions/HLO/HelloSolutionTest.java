package befaster.solutions.HLO;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloSolutionTest {

    private static HelloSolution hello;

    @BeforeAll
    public static void setUp() {
        hello = new HelloSolution();
    }

    @Test
    public void testHello() {
        assertEquals("Hello, World!", hello.hello("test"));
    }
}
