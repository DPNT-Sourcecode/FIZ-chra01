package befaster.solutions.TST;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OneTest {
    private One one;

    @BeforeAll
    public void name() {
        one = new One();
    }

    @Test
    public void run() {
        assertEquals(1, one.apply());
        //assertThat(one.apply(), equalTo(1));
    }
}