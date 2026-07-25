import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumNumbersTest {

    @Test
    public void testSumIsEven_1And1_ReturnsTrue() {
        SumNumbers sumNumbers = new SumNumbers();
        int result = sumNumbers.sumIsEven(1, 1);
        assertEquals(1, result);
    }

    @Test
    public void testSumIsEven_1And2_ReturnsFalse() {
        SumNumbers sumNumbers = new SumNumbers();
        int result = sumNumbers.sumIsEven(1, 2);
        assertEquals(0, result);
    }
}
