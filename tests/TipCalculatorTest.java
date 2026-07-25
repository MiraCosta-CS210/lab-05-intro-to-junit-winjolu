import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipCalculatorTest {

    @Test
    public void testCalculateTip_100Bill_20Percent() {
        TipCalculator calculator = new TipCalculator();
        double result = calculator.calculateTip(100.00, 20);
        assertEquals(20.00, result);
    }

    @Test
    public void testCalculateTip_50Bill_15Percent() {
        TipCalculator calculator = new TipCalculator();
        double result = calculator.calculateTip(50.00, 15);
        assertEquals(7.50, result);
    }
}
